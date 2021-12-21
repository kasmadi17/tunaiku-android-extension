# Tunaiku-Extensions

Tunaiku-Extensions is a Kotlin library to encapsulate all general extensions in tunaiku-android-app

## Installation

Add into your **root build.gradle**
```bash
allprojects {  
    repositories {  
        .....
        maven { url 'https://jitpack.io' } 
    }  
}
```

Add into your **gradle app**.

```bash
implementation "com.github.tunaiku:tunaiku-android-extensions:0.1.2-alpha02"
```


## Usage
There are several extensions which ready to use based on class of the source of the extensions. But first, you have to initiate with this function to your application class.
```bash
class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaInitialization.init(this)
    }
}
```

## Available Method
There are some methods which available to implement such as:


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
