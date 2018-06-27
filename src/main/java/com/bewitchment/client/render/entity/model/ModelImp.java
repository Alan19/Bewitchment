package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * imp - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelImp extends ModelBase {
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedBody;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer rLeg02;
	public ModelRenderer rLeg03;
	public ModelRenderer rLegFur;
	public ModelRenderer rHoof;
	public ModelRenderer lEar01;
	public ModelRenderer lHorn01a;
	public ModelRenderer upperJaw;
	public ModelRenderer lowerJaw;
	public ModelRenderer snout;
	public ModelRenderer rHorn01a;
	public ModelRenderer rEar01;
	public ModelRenderer lCheekFur;
	public ModelRenderer rCheekFur;
	public ModelRenderer lEar02;
	public ModelRenderer lEar03;
	public ModelRenderer lHorn01b;
	public ModelRenderer lHorn01c;
	public ModelRenderer lHorn01d;
	public ModelRenderer lHorn02;
	public ModelRenderer rHorn01b;
	public ModelRenderer rHorn01c;
	public ModelRenderer rHorn01d;
	public ModelRenderer rHorn02;
	public ModelRenderer rEar02;
	public ModelRenderer rEar03;
	public ModelRenderer tail01;
	public ModelRenderer lWing01;
	public ModelRenderer rWing01;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer tail05;
	public ModelRenderer tailFur01;
	public ModelRenderer tailFur02L;
	public ModelRenderer tailFur02R;
	public ModelRenderer tailFur03;
	public ModelRenderer lWing02;
	public ModelRenderer lWing03;
	public ModelRenderer lWingMembrane;
	public ModelRenderer lWing04;
	public ModelRenderer rWing02;
	public ModelRenderer rWing03;
	public ModelRenderer rWingMembrane;
	public ModelRenderer rWing04;
	public ModelRenderer lLeg02;
	public ModelRenderer lLeg03;
	public ModelRenderer lLegFur;
	public ModelRenderer lHoof;

	public ModelImp() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rWing03 = new ModelRenderer(this, 25, 56);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(-0.1F, -0.5F, 4.6F);
		this.rWing03.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(rWing03, 0.6283185307179586F, 0.0F, 0.0F);
		this.rWing04 = new ModelRenderer(this, 30, 55);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, 4.6F, 0.1F);
		this.rWing04.addBox(-0.5F, -0.5F, -7.1F, 1, 1, 7, 0.0F);
		this.setRotateAngle(rWing04, 0.7853981633974483F, 0.0F, 0.0F);
		this.tail04 = new ModelRenderer(this, 13, 43);
		this.tail04.setRotationPoint(0.0F, 0.0F, 3.9F);
		this.tail04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(tail04, 0.2792526803190927F, 0.0F, 0.0F);
		this.lLegFur = new ModelRenderer(this, 51, 53);
		this.lLegFur.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.lLegFur.addBox(0.0F, -0.7F, 0.0F, 0, 6, 3, 0.0F);
		this.setRotateAngle(lLegFur, -0.10471975511965977F, 0.0F, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 35, 10);
		this.lHorn02.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn02, -0.13962634015954636F, 0.0F, -0.10471975511965977F);
		this.rLeg03 = new ModelRenderer(this, 0, 36);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 3.5F, 0.4F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rLeg03, -0.3490658503988659F, 0.0F, 0.0F);
		this.tailFur02L = new ModelRenderer(this, 0, 51);
		this.tailFur02L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tailFur02L.addBox(0.2F, -0.3F, 0.0F, 0, 3, 5, 0.0F);
		this.setRotateAngle(tailFur02L, 0.0F, 0.12217304763960307F, 0.0F);
		this.lHorn01b = new ModelRenderer(this, 35, 5);
		this.lHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01b.addBox(-0.2F, -2.5F, -0.8F, 1, 3, 1, 0.0F);
		this.rEar01 = new ModelRenderer(this, 42, 0);
		this.rEar01.mirror = true;
		this.rEar01.setRotationPoint(-2.1F, -4.0F, 0.2F);
		this.rEar01.addBox(-1.0F, -3.0F, -0.9F, 1, 3, 2, 0.0F);
		this.setRotateAngle(rEar01, -0.4363323129985824F, -0.40142572795869574F, -0.4363323129985824F);
		this.rCheekFur = new ModelRenderer(this, 26, 32);
		this.rCheekFur.mirror = true;
		this.rCheekFur.setRotationPoint(-2.1F, -1.7F, -0.4F);
		this.rCheekFur.addBox(-1.0F, 0.0F, -2.9F, 1, 3, 5, 0.0F);
		this.setRotateAngle(rCheekFur, 0.17453292519943295F, -0.22689280275926282F, 0.3141592653589793F);
		this.snout = new ModelRenderer(this, 22, 0);
		this.snout.setRotationPoint(0.0F, -3.1F, -3.5F);
		this.snout.addBox(-1.5F, -1.0F, -1.9F, 3, 2, 3, 0.0F);
		this.setRotateAngle(snout, 0.41887902047863906F, 0.0F, 0.0F);
		this.lWing01 = new ModelRenderer(this, 25, 42);
		this.lWing01.setRotationPoint(2.5F, 2.4F, 1.8F);
		this.lWing01.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(lWing01, 0.40142572795869574F, 0.41887902047863906F, 0.0F);
		this.rWing01 = new ModelRenderer(this, 25, 42);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(-2.5F, 2.4F, 1.8F);
		this.rWing01.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
		this.setRotateAngle(rWing01, 0.40142572795869574F, -0.41887902047863906F, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.1F, 10.5F, 0.2F);
		this.bipedRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.2617993877991494F, 0.0F, 0.0F);
		this.tailFur02R = new ModelRenderer(this, 11, 51);
		this.tailFur02R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tailFur02R.addBox(-0.2F, -0.3F, 0.0F, 0, 3, 5, 0.0F);
		this.setRotateAngle(tailFur02R, 0.0F, -0.12217304763960307F, 0.0F);
		this.lEar03 = new ModelRenderer(this, 49, 0);
		this.lEar03.setRotationPoint(-0.1F, -0.2F, 0.1F);
		this.lEar03.addBox(-0.5F, -2.9F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.17453292519943295F);
		this.lWing03 = new ModelRenderer(this, 25, 56);
		this.lWing03.setRotationPoint(0.1F, -0.5F, 4.6F);
		this.lWing03.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(lWing03, 0.6283185307179586F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0.0F, 1.5F, 0.0F);
		this.bipedBody.addBox(-3.5F, 0.0F, -2.0F, 7, 10, 4, 0.0F);
		this.rLegFur = new ModelRenderer(this, 51, 53);
		this.rLegFur.mirror = true;
		this.rLegFur.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.rLegFur.addBox(0.0F, -0.7F, 0.0F, 0, 6, 3, 0.0F);
		this.setRotateAngle(rLegFur, -0.10471975511965977F, 0.0F, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-4.5F, 3.5F, -0.1F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
		this.lowerJaw = new ModelRenderer(this, 41, 11);
		this.lowerJaw.setRotationPoint(0.0F, -0.7F, -3.3F);
		this.lowerJaw.addBox(-2.0F, -0.5F, -1.6F, 4, 1, 2, 0.0F);
		this.rHorn01a = new ModelRenderer(this, 35, 5);
		this.rHorn01a.mirror = true;
		this.rHorn01a.setRotationPoint(-2.1F, -5.7F, -1.8F);
		this.rHorn01a.addBox(-0.8F, -2.5F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn01a, 0.0F, 0.0F, -0.22689280275926282F);
		this.lHorn01d = new ModelRenderer(this, 35, 5);
		this.lHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01d.addBox(-0.2F, -2.5F, -0.2F, 1, 3, 1, 0.0F);
		this.rHorn01c = new ModelRenderer(this, 35, 5);
		this.rHorn01c.mirror = true;
		this.rHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01c.addBox(-0.8F, -2.5F, -0.2F, 1, 3, 1, 0.0F);
		this.tail05 = new ModelRenderer(this, 13, 43);
		this.tail05.setRotationPoint(0.0F, 0.0F, 3.9F);
		this.tail05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(tail05, 0.2792526803190927F, 0.0F, 0.0F);
		this.upperJaw = new ModelRenderer(this, 41, 6);
		this.upperJaw.setRotationPoint(0.0F, -2.0F, -3.3F);
		this.upperJaw.addBox(-2.0F, -1.0F, -1.7F, 4, 2, 2, 0.0F);
		this.tail01 = new ModelRenderer(this, 13, 37);
		this.tail01.setRotationPoint(0.0F, 8.5F, 1.1F);
		this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(tail01, -1.0471975511965976F, 0.0F, 0.0F);
		this.lHorn01a = new ModelRenderer(this, 35, 5);
		this.lHorn01a.setRotationPoint(2.1F, -5.7F, -1.8F);
		this.lHorn01a.addBox(-0.8F, -2.5F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn01a, 0.0F, 0.0F, 0.22689280275926282F);
		this.lEar01 = new ModelRenderer(this, 42, 0);
		this.lEar01.setRotationPoint(2.1F, -4.0F, 0.2F);
		this.lEar01.addBox(0.0F, -3.0F, -0.9F, 1, 3, 2, 0.0F);
		this.setRotateAngle(lEar01, -0.4363323129985824F, 0.40142572795869574F, 0.4363323129985824F);
		this.lCheekFur = new ModelRenderer(this, 26, 32);
		this.lCheekFur.setRotationPoint(2.1F, -1.7F, -0.4F);
		this.lCheekFur.addBox(0.0F, 0.0F, -2.9F, 1, 3, 5, 0.0F);
		this.setRotateAngle(lCheekFur, 0.17453292519943295F, 0.22689280275926282F, -0.3141592653589793F);
		this.rEar03 = new ModelRenderer(this, 49, 0);
		this.rEar03.mirror = true;
		this.rEar03.setRotationPoint(0.1F, -0.2F, 0.1F);
		this.rEar03.addBox(-0.5F, -2.9F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rEar03, 0.0F, 0.0F, -0.17453292519943295F);
		this.rLeg02 = new ModelRenderer(this, 0, 27);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.1F, 5.0F, -0.7F);
		this.rLeg02.addBox(-1.5F, 0.0F, -1.4F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rLeg02, 0.6108652381980153F, 0.0F, 0.0F);
		this.tailFur03 = new ModelRenderer(this, 0, 53);
		this.tailFur03.setRotationPoint(0.0F, 0.3F, 0.0F);
		this.tailFur03.addBox(0.0F, 0.1F, 0.0F, 0, 3, 7, 0.0F);
		this.rWing02 = new ModelRenderer(this, 25, 48);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(-0.1F, 0.0F, 2.5F);
		this.rWing02.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(rWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.lWing04 = new ModelRenderer(this, 30, 55);
		this.lWing04.setRotationPoint(0.0F, 4.6F, 0.1F);
		this.lWing04.addBox(-0.5F, -0.5F, -7.1F, 1, 1, 7, 0.0F);
		this.setRotateAngle(lWing04, 0.7853981633974483F, 0.0F, 0.0F);
		this.lLeg03 = new ModelRenderer(this, 0, 36);
		this.lLeg03.setRotationPoint(0.0F, 3.5F, 0.4F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lLeg03, -0.3490658503988659F, 0.0F, 0.0F);
		this.lEar02 = new ModelRenderer(this, 49, 0);
		this.lEar02.setRotationPoint(0.4F, -2.6F, 0.1F);
		this.lEar02.addBox(-0.5F, -1.9F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lEar02, 0.13962634015954636F, 0.0F, 0.0F);
		this.tail02 = new ModelRenderer(this, 13, 43);
		this.tail02.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		this.rWingMembrane = new ModelRenderer(this, 42, 33);
		this.rWingMembrane.mirror = true;
		this.rWingMembrane.setRotationPoint(0.0F, -0.3F, 4.6F);
		this.rWingMembrane.addBox(0.0F, 0.0F, -7.1F, 0, 10, 10, 0.0F);
		this.setRotateAngle(rWingMembrane, -0.15707963267948966F, 0.0F, 0.0F);
		this.rHorn01b = new ModelRenderer(this, 35, 5);
		this.rHorn01b.mirror = true;
		this.rHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01b.addBox(-0.2F, -2.5F, -0.8F, 1, 3, 1, 0.0F);
		this.lHorn01c = new ModelRenderer(this, 35, 5);
		this.lHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01c.addBox(-0.8F, -2.5F, -0.2F, 1, 3, 1, 0.0F);
		this.rEar02 = new ModelRenderer(this, 49, 0);
		this.rEar02.mirror = true;
		this.rEar02.setRotationPoint(-0.4F, -2.6F, 0.1F);
		this.rEar02.addBox(-0.5F, -1.9F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rEar02, 0.13962634015954636F, 0.0F, 0.0F);
		this.rHoof = new ModelRenderer(this, 0, 44);
		this.rHoof.mirror = true;
		this.rHoof.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.rHoof.addBox(-1.05F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 40, 16);
		this.bipedLeftArm.setRotationPoint(4.5F, 3.5F, -0.1F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.setRotationPoint(2.1F, 10.5F, 0.2F);
		this.bipedLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.2617993877991494F, 0.0F, 0.0F);
		this.tailFur01 = new ModelRenderer(this, 0, 48);
		this.tailFur01.setRotationPoint(0.0F, 0.3F, 0.7F);
		this.tailFur01.addBox(0.0F, -0.4F, 0.0F, 0, 2, 4, 0.0F);
		this.setRotateAngle(tailFur01, -0.13962634015954636F, 0.0F, 0.0F);
		this.tail03 = new ModelRenderer(this, 13, 43);
		this.tail03.setRotationPoint(0.0F, 0.0F, 3.9F);
		this.tail03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(tail03, 0.22689280275926282F, 0.0F, 0.0F);
		this.rHorn01d = new ModelRenderer(this, 35, 5);
		this.rHorn01d.mirror = true;
		this.rHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01d.addBox(-0.2F, -2.5F, -0.2F, 1, 3, 1, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 35, 10);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn02, -0.13962634015954636F, 0.0F, 0.10471975511965977F);
		this.lLeg02 = new ModelRenderer(this, 0, 27);
		this.lLeg02.setRotationPoint(-0.1F, 5.0F, -0.7F);
		this.lLeg02.addBox(-1.5F, 0.0F, -1.4F, 3, 5, 3, 0.0F);
		this.setRotateAngle(lLeg02, 0.6108652381980153F, 0.0F, 0.0F);
		this.lWingMembrane = new ModelRenderer(this, 42, 33);
		this.lWingMembrane.setRotationPoint(0.0F, -0.3F, 4.6F);
		this.lWingMembrane.addBox(0.0F, 0.0F, -7.1F, 0, 10, 10, 0.0F);
		this.setRotateAngle(lWingMembrane, -0.15707963267948966F, 0.0F, 0.0F);
		this.lHoof = new ModelRenderer(this, 0, 44);
		this.lHoof.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.lHoof.addBox(-0.95F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 1.5F, 0.4F);
		this.bipedHead.addBox(-3.0F, -6.0F, -3.5F, 6, 6, 6, 0.0F);
		this.lWing02 = new ModelRenderer(this, 25, 48);
		this.lWing02.setRotationPoint(0.1F, 0.0F, 2.5F);
		this.lWing02.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(lWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.rWing02.addChild(this.rWing03);
		this.rWing03.addChild(this.rWing04);
		this.tail03.addChild(this.tail04);
		this.lLeg02.addChild(this.lLegFur);
		this.lHorn01a.addChild(this.lHorn02);
		this.rLeg02.addChild(this.rLeg03);
		this.tail05.addChild(this.tailFur02L);
		this.lHorn01a.addChild(this.lHorn01b);
		this.bipedHead.addChild(this.rEar01);
		this.bipedHead.addChild(this.rCheekFur);
		this.bipedHead.addChild(this.snout);
		this.bipedBody.addChild(this.lWing01);
		this.bipedBody.addChild(this.rWing01);
		this.tail05.addChild(this.tailFur02R);
		this.lEar01.addChild(this.lEar03);
		this.lWing02.addChild(this.lWing03);
		this.rLeg02.addChild(this.rLegFur);
		this.bipedHead.addChild(this.lowerJaw);
		this.bipedHead.addChild(this.rHorn01a);
		this.lHorn01a.addChild(this.lHorn01d);
		this.rHorn01a.addChild(this.rHorn01c);
		this.tail04.addChild(this.tail05);
		this.bipedHead.addChild(this.upperJaw);
		this.bipedBody.addChild(this.tail01);
		this.bipedHead.addChild(this.lHorn01a);
		this.bipedHead.addChild(this.lEar01);
		this.bipedHead.addChild(this.lCheekFur);
		this.rEar01.addChild(this.rEar03);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.tail05.addChild(this.tailFur03);
		this.rWing01.addChild(this.rWing02);
		this.lWing03.addChild(this.lWing04);
		this.lLeg02.addChild(this.lLeg03);
		this.lEar01.addChild(this.lEar02);
		this.tail01.addChild(this.tail02);
		this.rWing02.addChild(this.rWingMembrane);
		this.rHorn01a.addChild(this.rHorn01b);
		this.lHorn01a.addChild(this.lHorn01c);
		this.rEar01.addChild(this.rEar02);
		this.rLeg03.addChild(this.rHoof);
		this.tail04.addChild(this.tailFur01);
		this.tail02.addChild(this.tail03);
		this.rHorn01a.addChild(this.rHorn01d);
		this.rHorn01a.addChild(this.rHorn02);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.lWing02.addChild(this.lWingMembrane);
		this.lLeg03.addChild(this.lHoof);
		this.lWing01.addChild(this.lWing02);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedRightLeg.render(f5);
		this.bipedBody.render(f5);
		this.bipedRightArm.render(f5);
		this.bipedLeftArm.render(f5);
		this.bipedLeftLeg.render(f5);
		this.bipedHead.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}