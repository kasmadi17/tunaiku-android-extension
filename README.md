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
implementation "com.github.tunaiku:tunaiku-android-extensions:1.0.5"
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
Check out [our wiki](https://github.com/tunaiku/tunaiku-android-extension/wiki#tunaiku-android-extension-wiki) to see the available list extensions :)


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
