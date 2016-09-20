package org.gbif.maps

import org.gbif.maps.io.PointFeature.PointFeatures.Feature

import scala.collection.mutable.{Map => MMap}

/**
  * Types and case classes for map data.
  */
package object spark {
  type Year = Short

  type ZXY = (Short,Long,Long)
  type EncodedPixel = Int
  type EncodedPixelYear = Long

  case class Pixel (x: Short, y: Short)
  case class PixelYear (py: PixelYear, year: Short)

  case class FeatureCC (py: EncodedPixelYear, bor: Int)
  type TilePoints = MMap[Long,Int]
  case class TileCC (bor: Feature.BasisOfRecord, points: TilePoints)
}