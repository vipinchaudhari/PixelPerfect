# PixelPerfect

#### This library is used to create a pixel perfect design which self-adjusts for all devices with different resolutions. 

## Features:
- Easy to integrate. All you have to do is enable databinding in your code and use the predefined methods of the Binding Adapters to give sizes to layout components.
- Extremely lightweight 🏋.

## How to use this library?
- ### Gradle dependency: 
    - Add below code in the Project level gradle file.
        ```groovy
        allprojects {
          repositories {
            google()
            jcenter()
            maven { url "https://jitpack.io" }
          }
        } 
        ```
    - Add below dependency into your build.gradle file.
        ```groovy
        implementation 'com.github.vipinchaudhari:PixelPerfect:1.2'
        ```
    - Call below method to set your base screen resolution in Application class. The screen dimensions you provide here will be used as a base reference for calculating the component sizes. Default screen resolution is 360x640. You can get this ratio from your marvel app screens. 
    ```java
     ScreenRatio.setupScreenResolution(360,640,getApplicationContext());
     ```
- This is how you can use it in the layout file.
```xml
            <Button
            android:id="@+id/tv_pp"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toTopOf="@+id/tv_sp"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/iv_image"
            app:layout_marginEnd="@{16}"
            app:layout_marginStart="@{16}"
            app:textSize="@{24}" />

```
- Library provides XML attributes to customize the `RulerValuePicker` or you can customize it dynamically using Java/Kotlin code.

|Attribute|Type|
|:---:|:---:|
|layout_marginTop|Integer|
|layout_marginBottom|Integer|
|layout_marginStart|Integer|
|layout_marginEnd|Integer|
|layout_margin|Integer|
|layout_height|Integer|
|layout_width|Integer|
|textSize|Integer|
|edit_textSize|Integer|

#### Java: To use this pixel perfect attributes ,it is important that you inflate your layout with Databinding.For instance follow this:
```java
DataBindingUtil.setContentView(this,R.layout.activity_main);
```


## Screenshots:

|Sample 1|Sample 2|
|:---:|:---:|
|![profile-demo.gif](/.github/ruler-view-profile-demo-small.gif)|![ruler-view-demo.gif](/.github/ruler-view-demo-small.gif)|



## Want to contribute?
Every small or large contribution to this project is appreciated. Make sure you read the [contribution guide](/.github/CONTRIBUTING.md) before generating the pull request.

## Questions?🤔
E-mail me on vipsdeveloper@gmail.com

## Acknowledgements:
- This library is based on databinding concept.

## License
Copyright 2018 Vipin Chaudhari

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

<div align="center">
<img src="https://media.giphy.com/media/cegWQ66TiGYDK/giphy.gif">
</div>
