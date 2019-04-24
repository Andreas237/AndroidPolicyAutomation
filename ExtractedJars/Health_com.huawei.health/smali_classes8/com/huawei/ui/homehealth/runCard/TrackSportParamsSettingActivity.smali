.class public Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;
.implements Lo/cbu$e;
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;
.implements Lo/dhj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;,
        Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$e;
    }
.end annotation


# static fields
.field private static final c:I

.field private static final e:I


# instance fields
.field private A:Landroid/content/res/Resources;

.field private B:Landroid/content/Context;

.field private C:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;

.field private D:Landroid/widget/RelativeLayout;

.field private E:Z

.field private F:F

.field private G:I

.field private H:I

.field private I:I

.field private J:Lcom/amap/api/maps/MapView;

.field private K:Landroid/widget/ImageView;

.field private L:Landroid/graphics/drawable/AnimationDrawable;

.field private M:F

.field private N:Landroid/widget/RelativeLayout;

.field private O:Lcom/google/android/gms/maps/GoogleMap;

.field private P:Z

.field private Q:Landroid/widget/ImageView;

.field private R:Z

.field private S:Lcom/amap/api/maps/AMap;

.field private T:Landroid/location/Location;

.field private U:Z

.field private V:Z

.field private W:Landroid/location/Location;

.field private X:Z

.field private Y:F

.field private Z:Z

.field private a:Lo/emr;

.field private aa:Lo/dhl;

.field private ab:Z

.field private ac:Z

.field private ad:Landroid/os/Handler;

.field private b:Landroid/widget/TextView;

.field private d:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/RadioGroup;

.field private m:Landroid/widget/RadioButton;

.field private n:Landroid/widget/RadioButton;

.field private o:Landroid/widget/RadioButton;

.field private p:Landroid/widget/RadioButton;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/ImageButton;

.field private x:Landroid/widget/ImageButton;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/ImageButton;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 105
    const-string v0, "#7FFFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e:I

    .line 106
    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 94
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 145
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    .line 146
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->H:I

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->E:Z

    .line 166
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    .line 175
    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Y:F

    .line 179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ac:Z

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ab:Z

    .line 230
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->aa:Lo/dhl;

    .line 969
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$14;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$14;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ad:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageButton;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->x:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private a(DD)V
    .locals 8

    .line 525
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 526
    new-instance v4, Lcom/amap/api/maps/model/LatLng;

    invoke-direct {v4, p1, p2, p3, p4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 527
    const/high16 v0, 0x41840000    # 16.5f

    invoke-static {v0}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v5

    .line 528
    invoke-static {v4}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v6

    .line 529
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->M:F

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/amap/api/maps/CameraUpdateFactory;->scrollBy(FF)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v7

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v5}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v6}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v7}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 533
    goto :goto_0

    .line 534
    :cond_0
    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v4, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 535
    const/high16 v0, 0x41840000    # 16.5f

    invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomTo(F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    .line 536
    invoke-static {v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v6

    .line 537
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->M:F

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->scrollBy(FF)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v7

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 542
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->R:Z

    .line 543
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p()V

    .line 544
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateMapLocation , isconvert :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    return-void
.end method

.method private static b(IF)F
    .locals 2

    .line 571
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 572
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;I)I
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->H:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->j:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b(F)V
    .locals 7

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_distance_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 617
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 619
    float-to-double v0, p1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 620
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 624
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpl-double v0, v5, v0

    if-ltz v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_80:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 628
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 629
    goto/16 :goto_1

    .line 630
    :cond_1
    float-to-double v0, p1

    const-wide v2, 0x404518f5c28f5c29L    # 42.195

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_40:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto/16 :goto_1

    .line 634
    :cond_2
    float-to-double v0, p1

    const-wide v2, 0x403518f5c28f5c29L    # 21.0975

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_40:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_1

    .line 639
    :cond_3
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_4

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_70:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 641
    :cond_4
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_5

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_80:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 644
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 650
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 1169
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ab:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 1170
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/16 v3, 0x14

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1173
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1175
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->H:I

    return v0
.end method

.method private c()V
    .locals 3

    .line 242
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v2

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->aa:Lo/dhl;

    const-string v1, "sportTrackParamsSettingLocation"

    invoke-virtual {v2, v0, v1}, Lo/dhg;->c(Lo/dhl;Ljava/lang/String;)V

    .line 244
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v2, p0, v0}, Lo/dhg;->e(Lo/dhj;Ljava/lang/String;)V

    .line 245
    const-string v0, "sportTrackPreLocationToSport"

    invoke-virtual {v2, v0}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 246
    return-void
.end method

.method private c(I)V
    .locals 2

    .line 653
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 655
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->o:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 656
    goto :goto_1

    .line 658
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->n:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 659
    goto :goto_1

    .line 661
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 662
    goto :goto_1

    .line 665
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 668
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private c(IFZ)V
    .locals 6

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_90:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 578
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 580
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 582
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_calorie_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v1, p2, v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_calorie_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 586
    goto :goto_0

    .line 588
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_time_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 589
    const/high16 v0, 0x42700000    # 60.0f

    div-float v5, p2, v0

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    float-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_start_track_sport_min:I

    float-to-int v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 593
    goto :goto_0

    .line 596
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(F)V

    .line 598
    goto :goto_0

    .line 600
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_set_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 601
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->o()V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 603
    .line 608
    :goto_0
    if-eqz p3, :cond_0

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/ets;->b(Landroid/content/Context;I)V

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/ets;->d(Landroid/content/Context;F)V

    .line 612
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;Z)Z
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->X:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;F)F
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;I)I
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;IFZ)V
    .locals 0

    .line 94
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(IFZ)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;F)F
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Y:F

    return p1
.end method

.method private e()V
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 253
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l()V

    return-void
.end method

.method private f()V
    .locals 8

    .line 263
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBIEvent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 265
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 266
    const-string v0, "Run"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 267
    if-eqz v5, :cond_0

    const-string v0, "shortcut_Run"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBIEvent shortcut_Run..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 270
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    sget-object v0, Lo/dae;->hr:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 273
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 276
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->n()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)F
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    return v0
.end method

.method private g()V
    .locals 5

    .line 279
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->C:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;

    .line 281
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 282
    const-string v0, "track_params_activity_finish"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->C:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;

    invoke-static {v0, v1, v4}, Lo/dbg;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 284
    return-void
.end method

.method private h()V
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 258
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->L:Landroid/graphics/drawable/AnimationDrawable;

    .line 260
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Z:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    return v0
.end method

.method private i()V
    .locals 5

    .line 348
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_navigation:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_time_line_start_workout:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 358
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_page_bottom_setting:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$8;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps_sign_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f:Landroid/widget/ImageView;

    .line 375
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps_sign_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b:Landroid/widget/TextView;

    .line 377
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_sporttype_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l:Landroid/widget/RadioGroup;

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l:Landroid/widget/RadioGroup;

    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 379
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    .line 380
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_indoor_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m:Landroid/widget/RadioButton;

    .line 381
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_bike:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->o:Landroid/widget/RadioButton;

    .line 382
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->n:Landroid/widget/RadioButton;

    .line 384
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_choice_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d:Landroid/widget/RelativeLayout;

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 387
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_warm_up:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    .line 388
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->x:Landroid/widget/ImageButton;

    .line 389
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_music:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->w:Landroid/widget/ImageButton;

    .line 390
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_track_sport_params_settings_warm_up:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    .line 391
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_track_sport_params_settings_music:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->v:Landroid/widget/TextView;

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->w:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 400
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->w:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 405
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps_sign_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b:Landroid/widget/TextView;

    .line 406
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps_sign_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f:Landroid/widget/ImageView;

    .line 407
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->k:Landroid/widget/TextView;

    .line 408
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_gps_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h:Landroid/widget/LinearLayout;

    .line 410
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    .line 411
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_type_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->r:Landroid/widget/ImageView;

    .line 413
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    .line 414
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    .line 415
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_fitness_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i:Landroid/widget/LinearLayout;

    .line 416
    sget v0, Lcom/huawei/ui/homehealth/R$id;->indoor_running_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->s:Landroid/widget/TextView;

    .line 418
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_setting_white_map:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    .line 419
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_3

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_1

    .line 422
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 424
    :goto_1
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_setting_map_relative:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    .line 425
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_setting_map_marker:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    .line 428
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 431
    goto :goto_2

    .line 429
    :catch_0
    move-exception v4

    .line 430
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Location Marker OOM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    :goto_2
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_4

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->getMap()Lcom/amap/api/maps/AMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    if-eqz v0, :cond_4

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->S:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v4

    .line 439
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 440
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 445
    :cond_4
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(I)V

    .line 446
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(IFZ)V

    .line 448
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Z:Z

    if-eqz v0, :cond_5

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->x:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->btn_track_sport_setting_start_mirror:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 453
    :cond_5
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_6

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 458
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_show_sport_gps_not_open:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 463
    :cond_7
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(I)V

    .line 467
    :goto_3
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceOriginalClass() is  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v2

    invoke-virtual {v2}, Lo/fgb;->c()Lo/cmj;

    move-result-object v2

    invoke-virtual {v2}, Lo/cmj;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m:Landroid/widget/RadioButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 472
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$6;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 484
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Z:Z

    if-eqz v0, :cond_9

    .line 485
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->g:Landroid/widget/ImageView;

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 488
    :cond_9
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_anim_relative:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->D:Landroid/widget/RelativeLayout;

    .line 489
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_anim_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->j:Landroid/widget/ImageView;

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 493
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 494
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_value:I

    const/16 v1, 0x8

    invoke-virtual {v4, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 495
    const/4 v0, 0x1

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(IF)F

    move-result v0

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 499
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->x:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 522
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)F
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Y:F

    return v0
.end method

.method private k()V
    .locals 4

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->d(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->e(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->c(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    .line 334
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    if-nez v0, :cond_0

    .line 335
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 336
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No cache of sportType in SP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_1

    .line 339
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->E:Z

    goto :goto_0

    .line 341
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->E:Z

    .line 343
    :goto_0
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mTargetType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mTargetValue = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f:Landroid/widget/ImageView;

    return-object v0
.end method

.method private l()V
    .locals 5

    .line 843
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSportExtrasSettingView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 846
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 848
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 8

    .line 824
    const-string v4, "hwmediacenter://com.android.mediacenter/showrunplaylist?pver=80002300&portal=qq&from=com.huawei.health&needback=1"

    .line 825
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 826
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 828
    const/high16 v0, 0x14000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 829
    const-string v0, "tag"

    const-string v1, "com.huawei.health"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 831
    :try_start_0
    invoke-virtual {p0, v6}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 834
    goto :goto_0

    .line 832
    :catch_0
    move-exception v7

    .line 833
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music running list activity  not found, check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    :goto_0
    return-void
.end method

.method private n()V
    .locals 8

    .line 548
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->getLocationInWindow([I)V

    .line 550
    const/4 v0, 0x1

    aget v5, v4, v0

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    invoke-virtual {v0, v4}, Landroid/widget/RadioButton;->getLocationInWindow([I)V

    .line 552
    const/4 v0, 0x1

    aget v0, v4, v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    invoke-virtual {v1}, Landroid/widget/RadioButton;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x1

    aget v1, v4, v1

    sub-int v1, v5, v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    invoke-virtual {v2}, Landroid/widget/RadioButton;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int v5, v0, v1

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->getLocationInWindow([I)V

    .line 554
    const/4 v0, 0x1

    aget v0, v4, v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    sub-int v5, v0, v5

    .line 555
    int-to-float v0, v5

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->M:F

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 558
    const/4 v0, 0x1

    const/high16 v1, 0x41f80000    # 31.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(IF)F

    move-result v0

    float-to-int v7, v0

    .line 559
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Z:Z

    if-eqz v0, :cond_0

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, v5

    sub-int/2addr v0, v7

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v0, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, v7

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v5

    sub-int/2addr v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 564
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->W:Landroid/location/Location;

    if-eqz v0, :cond_1

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->W:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Landroid/location/Location;)V

    .line 568
    :cond_1
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->r()V

    return-void
.end method

.method private o()V
    .locals 2

    .line 933
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 935
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 923
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->R:Z

    if-nez v0, :cond_1

    .line 924
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 925
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h()V

    goto :goto_0

    .line 927
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 928
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e()V

    .line 930
    :goto_0
    return-void
.end method

.method private r()V
    .locals 7

    .line 1110
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->R:Z

    if-nez v0, :cond_0

    .line 1111
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dhk;->e(DD)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1113
    :pswitch_0
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    .line 1115
    goto :goto_1

    .line 1117
    :pswitch_1
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    .line 1119
    goto :goto_1

    .line 1121
    :pswitch_2
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    .line 1123
    goto :goto_1

    .line 1125
    :goto_0
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInChina default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    .line 1130
    :cond_0
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->V:Z

    if-eqz v0, :cond_2

    .line 1131
    new-instance v5, Lcom/amap/api/maps/CoordinateConverter;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 1132
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 1133
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 1134
    invoke-virtual {v5}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v6

    .line 1135
    if-eqz v6, :cond_1

    .line 1136
    iget-wide v0, v6, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v2, v6, Lcom/amap/api/maps/model/LatLng;->longitude:D

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(DD)V

    goto :goto_2

    .line 1138
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(DD)V

    .line 1140
    :goto_2
    goto :goto_3

    .line 1141
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(DD)V

    .line 1143
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private s()V
    .locals 9

    .line 1178
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pollingMusicActivity enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    const/16 v0, 0xc

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "com.lenovo.music"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "com.lenovo.music"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "com.android.music"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "com.lge.music"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "com.coolpad.music"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "com.google.android.music"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const-string v0, "com.google.android.music"

    const/4 v1, 0x6

    aput-object v0, v4, v1

    const-string v0, "com.tencent.qqmusic"

    const/4 v1, 0x7

    aput-object v0, v4, v1

    const-string v0, "com.netease.cloudmusic"

    const/16 v1, 0x8

    aput-object v0, v4, v1

    const-string v0, "com.kugou.android"

    const/16 v1, 0x9

    aput-object v0, v4, v1

    const-string v0, "cn.kuwo.player"

    const/16 v1, 0xa

    aput-object v0, v4, v1

    const-string v0, "fm.xiami.main"

    const/16 v1, 0xb

    aput-object v0, v4, v1

    .line 1192
    const/16 v0, 0xc

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "com.netease.cloudmusic.activity.MainActivity"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "com.lenovo.music.vl.phone.DMainActivity"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    const-string v0, "com.android.music.ui.MusicBrowserActivity"

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "com.lge.music.MusicBrowserActivity"

    const/4 v1, 0x3

    aput-object v0, v5, v1

    const-string v0, "cn.kuwo.coplayer.activities.MainActivity"

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const-string v0, "com.google.android.music.ui.tutorial.TutorialLaunchActivityc"

    const/4 v1, 0x5

    aput-object v0, v5, v1

    const-string v0, "com.google.android.music.tutorial.TutorialLaunchActivity"

    const/4 v1, 0x6

    aput-object v0, v5, v1

    const-string v0, "com.tencent.qqmusic.activity.AppStarterActivity"

    const/4 v1, 0x7

    aput-object v0, v5, v1

    const-string v0, "com.netease.cloudmusic.activity.MainActivity"

    const/16 v1, 0x8

    aput-object v0, v5, v1

    const-string v0, "com.kugou.android.app.MediaActivity"

    const/16 v1, 0x9

    aput-object v0, v5, v1

    const-string v0, "cn.kuwo.player.activities.MainActivity"

    const/16 v1, 0xa

    aput-object v0, v5, v1

    const-string v0, "fm.xiami.main.HomeActivity"

    const/16 v1, 0xb

    aput-object v0, v5, v1

    .line 1207
    const/4 v6, 0x1

    .line 1208
    const/4 v7, 0x0

    .line 1210
    :goto_0
    :try_start_0
    array-length v0, v4
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_3

    const/16 v0, 0xc

    if-ge v7, v0, :cond_0

    if-eqz v6, :cond_0

    .line 1212
    const/4 v6, 0x0

    .line 1213
    :try_start_1
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 1214
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1215
    aget-object v0, v4, v7

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1216
    new-instance v0, Landroid/content/ComponentName;

    aget-object v1, v4, v7

    aget-object v2, v5, v7

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1217
    invoke-virtual {p0, v8}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_3

    .line 1228
    goto :goto_1

    .line 1218
    :catch_0
    move-exception v8

    .line 1219
    const/4 v6, 0x1

    .line 1220
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pollingMusicActivity no proper activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aget-object v2, v5, v7

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1228
    goto :goto_1

    .line 1222
    :catch_1
    move-exception v8

    .line 1223
    const/4 v6, 0x1

    .line 1224
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception 1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1228
    goto :goto_1

    .line 1225
    :catch_2
    move-exception v8

    .line 1226
    const/4 v6, 0x1

    .line 1227
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_3

    .line 1210
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 1232
    :cond_0
    goto :goto_2

    .line 1230
    :catch_3
    move-exception v8

    .line 1231
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pollingMusicActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1234
    :goto_2
    array-length v0, v4

    const/16 v0, 0xc

    if-ne v7, v0, :cond_1

    .line 1235
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pollingMusicActivity no proper activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1237
    :try_start_3
    new-instance v8, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1238
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1239
    invoke-virtual {p0, v8}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    .line 1243
    goto :goto_3

    .line 1240
    :catch_4
    move-exception v8

    .line 1241
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pollingMusicActivity no proper activity last try"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1246
    :cond_1
    :goto_3
    return-void
.end method

.method private t()V
    .locals 5

    .line 1249
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findProperMusicActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1250
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1251
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1253
    invoke-static {}, Lo/cdq;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1254
    const-string v0, "com.miui.player"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1255
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.miui.player"

    const-string v2, "com.miui.player.ui.MusicBrowserActivity"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 1256
    :cond_0
    invoke-static {}, Lo/cdq;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1257
    const-string v0, "com.sec.android.app.music"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1258
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.sec.android.app.music"

    const-string v2, "com.sec.android.app.music.common.activity.MusicMainActivity"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 1259
    :cond_1
    invoke-static {}, Lo/cdq;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1260
    const-string v0, "com.meizu.media.music"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1261
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.meizu.media.music"

    const-string v2, "com.meizu.media.music.MusicActivity"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    .line 1262
    :cond_2
    invoke-static {}, Lo/cdq;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1263
    const-string v0, "com.android.bbkmusic"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1264
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.android.bbkmusic"

    const-string v2, "com.android.bbkmusic.WidgetToTrackActivity"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    .line 1265
    :cond_3
    invoke-static {}, Lo/cdq;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1266
    const-string v0, "com.miui.player"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1267
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.oppo.music"

    const-string v2, "com.oppo.music.MainListActivity"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    .line 1268
    :cond_4
    invoke-static {}, Lo/cdq;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1269
    const-string v0, "com.smartisanos.music"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1270
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.smartisanos.music"

    const-string v2, "com.smartisanos.music.activities.MusicMain"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1272
    :cond_5
    :goto_0
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findProperMusicActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1273
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1274
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 788
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoMusic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 791
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 792
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 793
    const-string v0, "com.android.mediacenter"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 794
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ac:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x103

    if-eq v0, v1, :cond_0

    .line 796
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    .line 797
    return-void

    .line 800
    :cond_0
    :try_start_1
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    .line 820
    goto/16 :goto_1

    .line 801
    :catch_0
    move-exception v4

    .line 802
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No this activity MUSIC_PLAYER "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    :try_start_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t()V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 815
    goto :goto_0

    .line 807
    :catch_1
    move-exception v5

    .line 808
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No this activity MUSIC_PLAYER e1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->s()V

    .line 815
    goto :goto_0

    .line 811
    :catch_2
    move-exception v5

    .line 812
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SE findProperMusicActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 815
    goto :goto_0

    .line 813
    :catch_3
    move-exception v5

    .line 814
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findProperMusicActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    :goto_0
    goto :goto_1

    .line 816
    :catch_4
    move-exception v4

    .line 817
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    goto :goto_1

    .line 818
    :catch_5
    move-exception v4

    .line 819
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    :goto_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 739
    new-instance v0, Lo/epj$b;

    invoke-direct {v0, p0}, Lo/epj$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$13;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    .line 740
    invoke-virtual {v0, v1}, Lo/epj$b;->c(Lo/epj$a;)Lo/epj$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$15;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    .line 766
    invoke-virtual {v0, v1}, Lo/epj$b;->e(Lo/epj$a;)Lo/epj$b;

    move-result-object v2

    .line 773
    invoke-virtual {v2}, Lo/epj$b;->b()Lo/epj;

    move-result-object v3

    .line 774
    invoke-virtual {v3}, Lo/epj;->show()V

    .line 775
    return-void
.end method

.method public b(I)V
    .locals 4

    .line 982
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 985
    :pswitch_0
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$5;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 994
    goto :goto_1

    .line 997
    :pswitch_1
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1007
    goto :goto_1

    .line 1009
    :pswitch_2
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1019
    goto :goto_1

    .line 1022
    :pswitch_3
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1032
    goto :goto_1

    .line 1034
    :pswitch_4
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$10;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1043
    goto :goto_1

    .line 1045
    :goto_0
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wrong GPS signal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public c(Landroid/content/Context;I)Lo/ehb;
    .locals 9

    .line 938
    new-instance v2, Lo/ehb$d;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ad:Landroid/os/Handler;

    invoke-direct {v2, p1, v0}, Lo/ehb$d;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 939
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-virtual {v2, p2, v0}, Lo/ehb$d;->b(II)Lo/ehb;

    move-result-object v3

    .line 940
    invoke-virtual {v3}, Lo/ehb;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 941
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 942
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 943
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 944
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 945
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v8

    .line 946
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v8, 0x2

    sub-int/2addr v0, v1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 947
    iput v8, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 948
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 949
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 950
    sget v0, Lcom/huawei/ui/homehealth/R$style;->track_dialog_anim:I

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 951
    invoke-virtual {v3}, Lo/ehb;->show()V

    .line 952
    return-object v3
.end method

.method public d()V
    .locals 5

    .line 778
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWarmUp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 779
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 781
    const-string v0, "track_type"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 782
    const-string v0, "track_target"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 783
    const-string v0, "track_targetvalue"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->F:F

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 784
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/brt;->a(Landroid/os/Bundle;)V

    .line 785
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1072
    return-void
.end method

.method public d(Landroid/location/Location;)V
    .locals 2

    .line 1090
    if-nez p1, :cond_0

    .line 1091
    return-void

    .line 1093
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->M:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 1094
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->W:Landroid/location/Location;

    .line 1095
    return-void

    .line 1097
    :cond_1
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    .line 1098
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_2

    .line 1099
    return-void

    .line 1101
    :cond_2
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$7;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1107
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 1062
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1164
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 1165
    const-string v0, "action_stop_play_sport_music"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Ljava/lang/String;)V

    .line 1166
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 6
    .param p2    # I
        .annotation build Landroid/support/annotation/IdRes;
        .end annotation
    .end param

    .line 853
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->s:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 856
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 857
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_bike:I

    if-ne p2, v0, :cond_0

    .line 858
    const/16 v0, 0x103

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 860
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 862
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    const-string v0, "sportType"

    const/16 v1, 0x103

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    sget-object v0, Lo/dae;->hp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 865
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 866
    goto/16 :goto_2

    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_walk:I

    if-ne p2, v0, :cond_1

    .line 867
    const/16 v0, 0x101

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 868
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 870
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 871
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    const-string v0, "sportType"

    const/16 v1, 0x101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 873
    sget-object v0, Lo/dae;->hp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 874
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 875
    goto/16 :goto_2

    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_run:I

    if-eq p2, v0, :cond_2

    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_indoor_run:I

    if-ne p2, v0, :cond_5

    .line 876
    :cond_2
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_indoor_run:I

    if-ne p2, v0, :cond_3

    .line 877
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 879
    const/16 v0, 0x108

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 881
    const-string v0, "sportType"

    const/16 v1, 0x108

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 883
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 884
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->K:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 886
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 889
    :goto_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 890
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 891
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_1

    .line 893
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->z:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 894
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 896
    :goto_1
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    sget-object v0, Lo/dae;->hp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 898
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 901
    :cond_5
    :goto_2
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->E:Z

    if-eqz v0, :cond_6

    .line 902
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->E:Z

    goto :goto_3

    .line 904
    :cond_6
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    .line 905
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    invoke-static {v0, v1}, Lo/ets;->b(Landroid/content/Context;I)V

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_set_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 909
    :goto_3
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkedId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "SportType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p()V

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;I)V

    .line 916
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->I:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    .line 917
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->o()V

    .line 920
    :cond_7
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 680
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->track_sport_params_settings_target_choice_layout:I

    if-ne v0, v1, :cond_0

    .line 681
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b()V

    goto/16 :goto_1

    .line 682
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_warm_up:I

    if-eq v0, v1, :cond_1

    .line 683
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->text_track_sport_params_settings_warm_up:I

    if-ne v0, v1, :cond_2

    .line 684
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d()V

    .line 685
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 686
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    sget-object v2, Lo/dae;->hI:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v9, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 689
    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_start:I

    if-ne v0, v1, :cond_4

    .line 690
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_3

    .line 691
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$e;

    invoke-direct {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$e;-><init>()V

    const-string v2, "sportTrackTempLocation"

    invoke-virtual {v0, v1, v2}, Lo/dhg;->c(Lo/dhl;Ljava/lang/String;)V

    .line 694
    :cond_3
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Y:F

    iget v4, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Y:F

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v9, v0

    .line 695
    const-wide/16 v0, 0x12c

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 696
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 697
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 698
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->D:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 725
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 726
    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->btn_track_sport_params_settings_music:I

    if-eq v0, v1, :cond_5

    .line 727
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->text_track_sport_params_settings_music:I

    if-ne v0, v1, :cond_7

    .line 728
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a()V

    .line 729
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 730
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    const-string v0, "pageType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    const-string v0, "musicType"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v1}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    sget-object v2, Lo/dae;->hz:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v9, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 736
    :cond_7
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 185
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 187
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    .line 188
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 189
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->track_activity_sport_params_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->setContentView(I)V

    .line 190
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_setting_map_gaode:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/MapView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    goto :goto_0

    .line 193
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->track_activity_sport_params_settings_google:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->setContentView(I)V

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->track_setting_map_google:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/maps/SupportMapFragment;

    .line 196
    if-eqz v4, :cond_1

    .line 197
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView() mapFragment is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-virtual {v4, p0}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    .line 201
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->A:Landroid/content/res/Resources;

    .line 202
    iput-object p0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->Z:Z

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ac:Z

    .line 205
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 207
    const/4 v5, 0x0

    .line 208
    if-eqz v4, :cond_3

    .line 209
    const-string v0, "isSelected"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ab:Z

    .line 210
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->ab:Z

    if-eqz v0, :cond_2

    .line 211
    invoke-static {}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d()V

    .line 214
    :cond_2
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 217
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f()V

    .line 218
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 219
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->k()V

    .line 220
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i()V

    .line 221
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c()V

    .line 222
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->g()V

    .line 224
    const/16 v0, 0x102

    if-ne v5, v0, :cond_4

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->G:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_4

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 228
    :cond_4
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 318
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 319
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->B:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->C:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;

    invoke-static {v0, v1}, Lo/dbg;->e(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 322
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->U:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onDestroy()V

    .line 325
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h()V

    .line 326
    return-void
.end method

.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 2

    .line 1076
    if-nez p1, :cond_0

    .line 1077
    return-void

    .line 1079
    :cond_0
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    .line 1080
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->O:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v1

    .line 1081
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 1082
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    if-eqz v0, :cond_1

    .line 1084
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->T:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Landroid/location/Location;)V

    .line 1086
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 5

    .line 298
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 300
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v4

    .line 301
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v4, v0}, Lo/dhg;->b(Ljava/lang/String;)V

    .line 302
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v4, v0}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 303
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onPause()V

    .line 307
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->X:Z

    if-eqz v0, :cond_1

    .line 308
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_1

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onDestroy()V

    .line 310
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->U:Z

    .line 313
    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 288
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 290
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c()V

    .line 291
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onResume()V

    .line 294
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1156
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1157
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->P:Z

    if-eqz v0, :cond_0

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->J:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/MapView;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1160
    :cond_0
    return-void
.end method
