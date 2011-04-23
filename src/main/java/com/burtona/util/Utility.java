package com.burtona.util;

import com.burtona.db.model.Album;
import com.burtona.db.model.AlbumApprovalStatus;
import com.burtona.db.model.AlbumComment;
import com.burtona.db.model.AlbumReview;
import com.burtona.db.model.AlbumTrack;
import com.burtona.db.model.AlbumTrackId;
import com.burtona.db.model.Artist;
import com.burtona.db.model.ArtistGenre;
import com.burtona.db.model.ArtistLabel;
import com.burtona.db.model.Carrier;
import com.burtona.db.model.CarrierDeliveryZone;
import com.burtona.db.model.CarrierStatus;
import com.burtona.db.model.DeliveryStatus;
import com.burtona.db.model.DeliveryType;
import com.burtona.db.model.Media;
import com.burtona.db.model.MediaComment;
import com.burtona.db.model.MediaTag;
import com.burtona.db.model.MediaType;
import com.burtona.db.model.Member;
import com.burtona.db.model.MemberEducation;
import com.burtona.db.model.MemberEducationDegreeType;
import com.burtona.db.model.MemberEducationType;
import com.burtona.db.model.MemberStatusType;
import com.burtona.db.model.Sale;
import com.burtona.db.model.SaleItem;
import com.burtona.db.model.SaleItemId;
import com.burtona.db.model.SaleItemType;
import com.burtona.db.model.SalePaymentType;
import com.burtona.db.model.SaleStatus;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class Utility {
	private static XStream xmlstream = new XStream();
	private static XStream jsonstream = new XStream(new JsonHierarchicalStreamDriver());
	
	static{
		xmlstream.alias("album", Album.class);
		xmlstream.alias("albumstatus", AlbumApprovalStatus.class);
		xmlstream.alias("albumcomment", AlbumComment.class);
		xmlstream.alias("albumreview", AlbumReview.class);
		xmlstream.alias("albumtrack", AlbumTrack.class);
		xmlstream.alias("albumtrackid", AlbumTrackId.class);
		
		xmlstream.alias("artist", Artist.class);
		xmlstream.alias("genre", ArtistGenre.class);
		xmlstream.alias("label", ArtistLabel.class);
		
		xmlstream.alias("carrier", Carrier.class);		
		xmlstream.alias("deliveryzone", CarrierDeliveryZone.class);
		xmlstream.alias("carrierstatus", CarrierStatus.class);
		
		xmlstream.alias("deliverystatus", DeliveryStatus.class);
		xmlstream.alias("deliverytype", DeliveryType.class);
		
		xmlstream.alias("media", Media.class);
		xmlstream.alias("mediacomment", MediaComment.class);
		xmlstream.alias("mediatag", MediaTag.class);
		xmlstream.alias("mediatype", MediaType.class);
		
		xmlstream.alias("member", Member.class);
		xmlstream.alias("membereducation", MemberEducation.class);
		xmlstream.alias("membereducationdegreetype", MemberEducationDegreeType.class);
		xmlstream.alias("membereducationtype", MemberEducationType.class);
		xmlstream.alias("memberstatustype", MemberStatusType.class);
		
		xmlstream.alias("sale", Sale.class);
		xmlstream.alias("salestatus", SaleStatus.class);
		xmlstream.alias("saleitem", SaleItem.class);
		xmlstream.alias("saleitemid", SaleItemId.class);
		xmlstream.alias("salestatus", SaleStatus.class);
		xmlstream.alias("saleitemtype", SaleItemType.class);
		xmlstream.alias("salepaymenttype", SalePaymentType.class);
		
		xmlstream.setMode(XStream.NO_REFERENCES);
		
		jsonstream.alias("album", Album.class);
		jsonstream.alias("albumstatus", AlbumApprovalStatus.class);
		jsonstream.alias("albumcomment", AlbumComment.class);
		jsonstream.alias("albumreview", AlbumReview.class);
		jsonstream.alias("albumtrack", AlbumTrack.class);
		jsonstream.alias("albumtrackid", AlbumTrackId.class);
		
		jsonstream.alias("artist", Artist.class);
		jsonstream.alias("genre", ArtistGenre.class);
		jsonstream.alias("label", ArtistLabel.class);
		
		jsonstream.alias("carrier", Carrier.class);		
		jsonstream.alias("deliveryzone", CarrierDeliveryZone.class);
		jsonstream.alias("carrierstatus", CarrierStatus.class);
		
		jsonstream.alias("deliverystatus", DeliveryStatus.class);
		jsonstream.alias("deliverytype", DeliveryType.class);
		
		jsonstream.alias("media", Media.class);
		jsonstream.alias("mediacomment", MediaComment.class);
		jsonstream.alias("mediatag", MediaTag.class);
		jsonstream.alias("mediatype", MediaType.class);
		
		jsonstream.alias("member", Member.class);
		jsonstream.alias("membereducation", MemberEducation.class);
		jsonstream.alias("membereducationdegreetype", MemberEducationDegreeType.class);
		jsonstream.alias("membereducationtype", MemberEducationType.class);
		jsonstream.alias("memberstatustype", MemberStatusType.class);
		
		jsonstream.alias("sale", Sale.class);
		jsonstream.alias("salestatus", SaleStatus.class);
		jsonstream.alias("saleitem", SaleItem.class);
		jsonstream.alias("saleitemid", SaleItemId.class);
		jsonstream.alias("salestatus", SaleStatus.class);
		jsonstream.alias("saleitemtype", SaleItemType.class);
		jsonstream.alias("salepaymenttype", SalePaymentType.class);
		
		jsonstream.setMode(XStream.NO_REFERENCES);
	}
	
	public static String toXml(Object obj)
	{
		return xmlstream.toXML(obj);
	}
	
	public static Object fromXml(String xml)
	{
		return xmlstream.fromXML(xml);
	}
	
	public static String toJson(Object obj)
	{
		return jsonstream.toXML(obj);
	}
	
	public static Object fromJson(String xml)
	{
		return jsonstream.fromXML(xml);
	}

}
