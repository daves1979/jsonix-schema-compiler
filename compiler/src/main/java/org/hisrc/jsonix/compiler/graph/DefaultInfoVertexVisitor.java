package org.hisrc.jsonix.compiler.graph;

public class DefaultInfoVertexVisitor<T, C, V> implements InfoVertexVisitor<T, C, V> {

	@Override
	public V visitPackageInfoVertex(PackageInfoVertex<T, C> vertex) {
		return null;
	}

	@Override
	public V visitTypeInfoVertex(TypeInfoVertex<T, C> vertex) {
		return null;
	}

	@Override
	public V visitElementInfoVertex(ElementInfoVertex<T, C> vertex) {
		return null;
	}

	@Override
	public V visitPropertyInfoVertex(PropertyInfoVertex<T, C> vertex) {
		return null;
	}

}