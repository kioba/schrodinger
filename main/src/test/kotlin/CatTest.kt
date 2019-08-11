import org.junit.jupiter.api.Test

class CatTest {

    @Test
    fun emptyTest() {
        assert(empty<Int>() == null) { "Empty value is null" }
    }

    @Test
    fun identityTest() {
        assert(identity(0) == 0) { "Identity returns the value" }
    }

    @Test
    fun isEmptyOnNullTest() {
        assert(null.isEmpty()) { "isEmpty should return true for a null" }
    }

    @Test
    fun isEmptyOnSomeTest() {
        assert(1.isEmpty().not()) { "isEmpty should return false for a nonNull" }
    }

    @Test
    fun isSomeOnNullTest() {
        assert(null.isSome().not()) { "isSome should return false for a null" }
    }

    @Test
    fun isSomeOnSomeTest() {
        assert(1.isSome()) { "isEmpty should return false for a nonNull" }
    }

    @Test
    fun maybeOnTrueTest() {
        assert(true.maybe { "a" } == "a") { "Maybe should return the value if it is true" }
    }

    @Test
    fun maybeOnFalseTest() {
        assert(false.maybe { "a" } == null) { "Maybe should return null if it is false" }
    }

    @Test
    fun mapOnNullTest() {
        assert(null.map { 1 } == null)
    }

    @Test
    fun mapOnValueTest() {
        assert(2.map { 1 } == 1)
    }

    @Test
    fun filterKeepValueTest() {
        assert(1.filter { it < 5 } == 1) { "filter should keep the value if the predicate is true" }
    }

    @Test
    fun filterDiscardValueTest() {
        assert(1.filter { it > 5 } == null) { "filter should discard the value if the predicate is false" }
    }
}