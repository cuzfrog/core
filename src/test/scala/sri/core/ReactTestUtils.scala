package sri.core

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

@js.native
@JSImport("react-addons-test-utils", JSImport.Namespace)
object ReactTestUtils extends js.Object {

  val Simulate: js.Dynamic = js.native

  def renderIntoDocument(instance: ReactElement): js.Dynamic = js.native

  def isElement(element: ReactElement): Boolean = js.native

  def createRenderer(): ReactShallowRenderer = js.native
}

@js.native
trait ReactShallowRenderer extends js.Object {

  def render(element: ReactElement): js.Dynamic = js.native

  def getRenderOutput(): ShallowRenderOutput = js.native

  def getMountedInstance[T <: ReactClass](): T = js.native
}

@js.native
trait ShallowRenderOutput extends js.Object {

  val props: ShallowProps = js.native

  @JSName("props") val propsDynamic: js.Dynamic = js.native

}

@js.native
trait ShallowProps extends js.Object {

  def children: js.Array[ShallowRenderOutput] = js.native

}

@js.native
@JSImport("react-dom", JSImport.Namespace)
object ReactDOM extends js.Object {

  def render[I](element: ReactElement { type Instance = I }, container: js.Any, callback: js.Function0[_] = ???)
    : I = js.native
}
