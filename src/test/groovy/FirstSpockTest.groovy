/**
 * Created with IntelliJ IDEA.
 * User: jan
 * Date: 22.08.13
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
class FirstSpockTest extends spock.lang.Specification {
  def "length of Spock's and his friends' names"() {
    expect:
    name.size() == length

    where:
    name     | length
    "Spock"  | 5
    "Kirk"   | 4
    "Scotty" | 6
  }
}
