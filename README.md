# KotlinDebouncer

A utility class for debouncing high-frequency events in Android using Kotlin Coroutines.

## Description

Debouncing ensures that high-frequency events (like rapid button clicks) trigger functionality only once in a specified time interval, 
instead of for each and every event. This can be especially useful for preventing redundant network requests, 
or avoiding interface glitches due to fast successive updates.

This `KotlinDebouncer` is a simple utility that can be used to debounce events in Android. It uses Kotlin Coroutines to manage asynchronous tasks effectively.

## Usage

First, initialize the `Debouncer` with a `CoroutineScope`:

```kotlin
val debouncer = Debouncer(lifecycleScope)
```

Then, use the debounce method to debounce an event:

```kotlin
myButton.setOnClickListener {
    debouncer.debounce(300L) {
        // Handle button click after 300ms debounce
    }
}
```

