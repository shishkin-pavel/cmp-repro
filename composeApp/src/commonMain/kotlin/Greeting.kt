import androidx.compose.runtime.collection.MutableVector

class Greeting {
    private val platform = getPlatform()
    private val mv = MutableVector<Int>()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}