.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/dhj;
.implements Lo/cbu$e;
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;,
        Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;,
        Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;,
        Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;
    }
.end annotation


# static fields
.field private static final O:I

.field private static final Q:I

.field private static w:I


# instance fields
.field private A:Z

.field private B:I

.field private C:Landroid/app/Activity;

.field private D:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

.field private E:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;

.field private F:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;

.field private G:Lo/esg;

.field private H:Landroid/os/Bundle;

.field private I:Landroid/view/View;

.field private J:Z

.field private K:I

.field private L:Z

.field private M:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

.field private N:I

.field private P:Z

.field private R:Ljava/lang/String;

.field private S:Lo/dcy;

.field private T:Z

.field private U:Z

.field private V:Lo/dhl;

.field private W:Lcom/amap/api/maps/model/Marker;

.field private X:Z

.field private Z:Lcom/google/android/gms/maps/model/Marker;

.field a:Landroid/location/Location;

.field private b:Landroid/content/Context;

.field private c:Lo/emq;

.field private d:Lo/ese;

.field private e:Landroid/support/v4/view/ViewPager;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lcom/amap/api/maps/TextureMapView;

.field private i:Landroid/content/res/Resources;

.field private j:Z

.field private k:Landroid/widget/TextView;

.field private l:Lcom/amap/api/maps/AMap;

.field private m:Z

.field private n:Landroid/widget/RelativeLayout;

.field private o:Z

.field private p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

.field private q:Lcom/google/android/gms/maps/GoogleMap;

.field private r:Lcom/google/android/gms/maps/SupportMapFragment;

.field private s:I

.field private t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

.field private u:Landroid/widget/LinearLayout;

.field private v:Z

.field private x:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 152
    const/16 v0, 0x10

    sput v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->w:I

    .line 195
    const/16 v0, 0xff

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->Q:I

    .line 196
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->O:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 100
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o:Z

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->s:I

    .line 153
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    .line 154
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->j:Z

    .line 158
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->A:Z

    .line 168
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->K:I

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->L:Z

    .line 188
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->P:Z

    .line 192
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->R:Ljava/lang/String;

    .line 193
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->S:Lo/dcy;

    .line 200
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->U:Z

    .line 203
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->T:Z

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->X:Z

    .line 783
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->V:Lo/dhl;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    return-object v0
.end method

.method private a()V
    .locals 11

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->p(Landroid/content/Context;)Z

    move-result v4

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 274
    invoke-static {}, Lo/czu;->e()Z

    move-result v6

    .line 275
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils.isOversea()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  chineseSimplifiedLocal"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    if-nez v6, :cond_0

    if-nez v5, :cond_1

    .line 277
    :cond_0
    return-void

    .line 279
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_time_first_in"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 281
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    return-void

    .line 284
    :cond_2
    invoke-static {v7}, Lo/ets;->e(Ljava/lang/String;)Z

    move-result v8

    .line 285
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanTip = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  diffDate"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    if-nez v4, :cond_3

    if-eqz v8, :cond_3

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->sport_entrance_tips:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 288
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/view/View;->measure(II)V

    .line 289
    new-instance v10, Landroid/widget/PopupWindow;

    const/4 v0, -0x2

    const/4 v1, -0x2

    const/4 v2, 0x1

    invoke-direct {v10, v9, v0, v1, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 291
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v10, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 294
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PopupWindow = show"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/high16 v2, 0x42480000    # 50.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/high16 v3, 0x42840000    # 66.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v10, v0, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ets;->a(Landroid/content/Context;Z)V

    .line 299
    :cond_3
    return-void
.end method

.method private a(Landroid/location/Location;)V
    .locals 7

    .line 806
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->y:Z

    if-nez v0, :cond_0

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dhk;->e(DD)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 809
    :pswitch_0
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->z:Z

    .line 811
    goto :goto_1

    .line 813
    :pswitch_1
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->z:Z

    .line 815
    goto :goto_1

    .line 817
    :pswitch_2
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->z:Z

    .line 819
    goto :goto_1

    .line 821
    :goto_0
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInChina default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->z:Z

    .line 826
    :cond_0
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->z:Z

    if-eqz v0, :cond_2

    .line 827
    const-string v0, "showLocation"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 828
    new-instance v5, Lcom/amap/api/maps/CoordinateConverter;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 829
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 830
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 831
    invoke-virtual {v5}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v6

    .line 832
    if-eqz v6, :cond_1

    .line 833
    iget-wide v0, v6, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v2, v6, Lcom/amap/api/maps/model/LatLng;->longitude:D

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(DD)V

    goto :goto_2

    .line 835
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(DD)V

    .line 837
    :goto_2
    goto :goto_3

    .line 838
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(DD)V

    .line 840
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b()I
    .locals 1

    .line 100
    sget v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->w:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Ljava/lang/String;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->K:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/amap/api/maps/model/Marker;)Lcom/amap/api/maps/model/Marker;
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->W:Lcom/amap/api/maps/model/Marker;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/emq;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    return-object v0
.end method

.method private c(Landroid/location/Location;)V
    .locals 7

    .line 1043
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveLastLocation "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1045
    return-void

    .line 1046
    :cond_0
    const/4 v0, 0x2

    new-array v6, v0, [D

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v6, v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v6, v2

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_location_position"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    aget-wide v4, v6, v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/4 v4, 0x1

    aget-wide v4, v6, v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1048
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1047
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1049
    return-void
.end method

.method private c(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    .line 317
    if-nez p1, :cond_0

    .line 318
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView rootView null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    return-void

    .line 321
    :cond_0
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_sport_tab:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 328
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    .line 329
    const-string v0, "mSubTabItemMargin"

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 330
    if-eqz v5, :cond_1

    .line 331
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lhuawei/widget/hwsubtab/R$dimen;->hwsubtab_item_margin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 338
    :cond_1
    goto :goto_0

    .line 334
    :catch_0
    move-exception v4

    .line 335
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t get mSubTabItemMargin field for subtab"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    goto :goto_0

    .line 336
    :catch_1
    move-exception v4

    .line 337
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set subtab field value mSubTabItemMargin failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :cond_2
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->viewPager_sport:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    .line 343
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_setting:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e()V

    .line 348
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_sport_stat_info:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    .line 351
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    .line 352
    const/4 v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_sport_type_run:I

    .line 353
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_sport_type_walk:I

    .line 354
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    .line 355
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->sug_myplan_traned:I

    .line 356
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 358
    const/4 v0, 0x4

    new-array v5, v0, [Landroid/support/v4/app/Fragment;

    .line 360
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->D:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    .line 361
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->E:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;

    .line 362
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->F:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->D:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->E:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->F:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 368
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 369
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support fitness"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    new-instance v0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;-><init>()V

    const/4 v1, 0x3

    aput-object v0, v5, v1

    goto :goto_1

    .line 372
    :cond_3
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 373
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->X:Z

    if-eqz v0, :cond_4

    .line 375
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support cloud but not china site"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;-><init>()V

    const/4 v1, 0x3

    aput-object v0, v5, v1

    goto :goto_1

    .line 378
    :cond_4
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    new-instance v0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;-><init>()V

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 382
    :goto_1
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_gps_signal:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k:Landroid/widget/TextView;

    .line 383
    const-string v0, "initView"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 386
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(I)V

    goto :goto_2

    .line 388
    :cond_5
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(I)V

    .line 393
    :goto_2
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_entrance_indoor:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->track_entrance_indoor_setting_bg_bigcd:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 397
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 497
    new-instance v0, Lo/ese;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    invoke-direct {v0, v1, v2, v3}, Lo/ese;-><init>(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d:Lo/ese;

    .line 498
    const/4 v6, 0x0

    :goto_3
    array-length v0, v4

    const/4 v0, 0x4

    if-ge v6, v0, :cond_8

    array-length v0, v5

    const/4 v0, 0x4

    if-ge v6, v0, :cond_8

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d:Lo/ese;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    aget-object v2, v4, v6

    invoke-virtual {v1, v2}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v1

    aget-object v2, v5, v6

    iget v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    if-ne v3, v6, :cond_7

    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {v0, v1, v2, v3}, Lo/ese;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 498
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 540
    :cond_8
    return-void
.end method

.method private c(Lcom/amap/api/maps/model/LatLng;)V
    .locals 3

    .line 1100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    if-eqz v0, :cond_0

    .line 1101
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1102
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1103
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->sendMessage(Landroid/os/Message;)Z

    .line 1105
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 1691
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1692
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    .line 1693
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mContext is null, get it again "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1695
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z
    .locals 0

    .line 100
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->U:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/google/android/gms/maps/model/Marker;)Lcom/google/android/gms/maps/model/Marker;
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->Z:Lcom/google/android/gms/maps/model/Marker;

    return-object p1
.end method

.method private d()V
    .locals 4

    .line 251
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Enter initAll"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    invoke-static {}, Lo/esa;->d()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 253
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_RUNCURSE_SUPPORT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->X:Z

    .line 256
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k()V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->H:Landroid/os/Bundle;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Landroid/view/View;Landroid/os/Bundle;)V

    .line 261
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o()V

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->A:Z

    .line 266
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Leave initAll"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z
    .locals 0

    .line 100
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->s:I

    return p1
.end method

.method private e(DD)V
    .locals 7

    .line 843
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;DD)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 875
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->y:Z

    .line 877
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/amap/api/maps/model/LatLng;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/amap/api/maps/model/LatLng;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 1680
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 1681
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/16 v3, 0x14

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1682
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1684
    const-string v0, "sendActionToMusicService"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 1686
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1688
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->j:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z
    .locals 0

    .line 100
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->j:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    return v0
.end method

.method private f()V
    .locals 5

    .line 767
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->T:Z

    if-eqz v0, :cond_0

    .line 768
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFirstTimeOpenApp is true, do not regGPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    return-void

    .line 771
    :cond_0
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v4

    .line 772
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->V:Lo/dhl;

    const-string v1, "sportTrackParamsSettingLocation"

    invoke-virtual {v4, v0, v1}, Lo/dhg;->c(Lo/dhl;Ljava/lang/String;)V

    .line 773
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v4, p0, v0}, Lo/dhg;->e(Lo/dhj;Ljava/lang/String;)V

    .line 774
    const-string v0, "sportTrackPreLocationToSport"

    invoke-virtual {v4, v0}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 775
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->K:I

    return v0
.end method

.method private g()[D
    .locals 10

    .line 1056
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_location_position"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1058
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1059
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 1060
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    array-length v0, v5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    aget-object v0, v5, v0

    .line 1061
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1062
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 1063
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 1065
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastLocation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_0

    .line 1067
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/4 v1, 0x2

    new-array v1, v1, [D

    const/4 v2, 0x0

    aput-wide v6, v1, v2

    const/4 v2, 0x1

    aput-wide v8, v1, v2

    invoke-static {v0, v1}, Lo/cdr;->d(Landroid/content/Context;[D)[D

    move-result-object v0

    return-object v0

    .line 1069
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [D

    const/4 v1, 0x0

    aput-wide v6, v0, v1

    const/4 v1, 0x1

    aput-wide v8, v0, v1

    return-object v0

    .line 1073
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->s:I

    return v0
.end method

.method private h()V
    .locals 10

    .line 994
    const-string v0, "setGaodeMapLocationMarker"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 997
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 998
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 1001
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    iget v1, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/high16 v3, 0x42a80000    # 84.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/AMap;->setPointToCenter(II)V

    .line 1003
    new-instance v6, Lcom/amap/api/maps/model/MyLocationStyle;

    invoke-direct {v6}, Lcom/amap/api/maps/model/MyLocationStyle;-><init>()V

    .line 1004
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v6}, Lcom/amap/api/maps/AMap;->setMyLocationStyle(Lcom/amap/api/maps/model/MyLocationStyle;)V

    .line 1005
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 1006
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setMyLocationEnabled(Z)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setMyLocationType(I)V

    .line 1014
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1015
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cdr;->d(Landroid/content/Context;)Landroid/location/Location;

    move-result-object v7

    .line 1016
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGaodeMapLocationMarker "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1017
    if-eqz v7, :cond_0

    .line 1018
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cdr;->b(Landroid/content/Context;Landroid/location/Location;)[D

    move-result-object v8

    .line 1019
    new-instance v9, Lcom/amap/api/maps/model/LatLng;

    const/4 v0, 0x0

    aget-wide v0, v8, v0

    const/4 v2, 0x1

    aget-wide v2, v8, v2

    invoke-direct {v9, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 1020
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    invoke-static {v9}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    const/high16 v1, 0x41840000    # 16.5f

    invoke-static {v1}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1023
    goto :goto_0

    .line 1026
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g()[D

    move-result-object v8

    .line 1027
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    array-length v0, v8

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1028
    new-instance v9, Lcom/amap/api/maps/model/LatLng;

    const/4 v0, 0x0

    aget-wide v0, v8, v0

    const/4 v2, 0x1

    aget-wide v2, v8, v2

    invoke-direct {v9, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    invoke-static {v9}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    const/high16 v1, 0x41840000    # 16.5f

    invoke-static {v1}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1033
    :cond_1
    :goto_0
    goto :goto_1

    .line 1034
    :cond_2
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No Location Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    :goto_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    return v0
.end method

.method private i()V
    .locals 2

    .line 778
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v1

    .line 779
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v1, v0}, Lo/dhg;->b(Ljava/lang/String;)V

    .line 780
    const-string v0, "sportTrackParamsSettingLocation"

    invoke-virtual {v1, v0}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 781
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/esg;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 302
    const-string v0, "initData"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    sput v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->w:I

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->d(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    .line 306
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->h(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    .line 308
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 309
    :cond_0
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/16 v1, 0x102

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;I)V

    .line 314
    :cond_1
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    return-object v0
.end method

.method private l()Z
    .locals 3

    .line 1091
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 1092
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 1093
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    .line 1094
    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1093
    :goto_0
    return v0

    .line 1096
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    return-object v0
.end method

.method private m()Z
    .locals 4

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 1083
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    .line 1084
    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    .line 1086
    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    if-ne v2, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v0, v1

    .line 1083
    return v0

    .line 1088
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    return-object v0
.end method

.method private n()V
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1151
    const-string v0, "setGoogleMapLocationMarker"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 1152
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 1153
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 1154
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 1157
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/high16 v1, 0x42820000    # 65.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v7

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    iget v1, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    int-to-float v3, v7

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    iget v3, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v3, v3, 0x2

    iget v4, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int/2addr v4, v7

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->setPadding(IIII)V

    .line 1161
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cdr;->d(Landroid/content/Context;)Landroid/location/Location;

    move-result-object v8

    .line 1163
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoogleMapLocationMarker "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1164
    if-eqz v8, :cond_0

    .line 1165
    new-instance v9, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v8}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {v8}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {v9, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {v9}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 1167
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    const/high16 v1, 0x41780000    # 15.5f

    invoke-static {v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomTo(F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 1169
    goto :goto_0

    .line 1171
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g()[D

    move-result-object v9

    .line 1172
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    array-length v0, v9

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1173
    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    const/4 v0, 0x0

    aget-wide v0, v9, v0

    const/4 v2, 0x1

    aget-wide v2, v9, v2

    invoke-direct {v10, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 1174
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {v10}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 1175
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    const/high16 v1, 0x41780000    # 15.5f

    invoke-static {v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomTo(F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 1178
    :cond_1
    :goto_0
    goto :goto_1

    .line 1179
    :cond_2
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No Location Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    :goto_1
    return-void
.end method

.method private o()V
    .locals 6

    .line 1108
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1113
    const-string v0, "initReceiver"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 1116
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->x:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    .line 1117
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 1118
    const-string v0, "track_entrance_map_visibility_action"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1119
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->x:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1121
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->M:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

    .line 1122
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 1123
    const-string v0, "track_receiver_goto_sport"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1124
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->M:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1126
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    return-object v0
.end method

.method private p()V
    .locals 5

    .line 1509
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1510
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1511
    sget-object v0, Lo/dae;->ig:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 1512
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1513
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->U:Z

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/model/Marker;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->Z:Lcom/google/android/gms/maps/model/Marker;

    return-object v0
.end method

.method private r()V
    .locals 4

    .line 1517
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    if-nez v0, :cond_0

    .line 1518
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f()V

    .line 1520
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_1

    .line 1521
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->onResume()V

    .line 1522
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGaodeMapView.onResume."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1524
    :cond_1
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/model/Marker;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->W:Lcom/amap/api/maps/model/Marker;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o:Z

    return v0
.end method

.method private u()V
    .locals 4

    .line 1527
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i()V

    .line 1528
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_0

    .line 1529
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->onPause()V

    .line 1530
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGaodeMapView.onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1533
    :cond_0
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z
    .locals 1

    .line 100
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1634
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyMap  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1635
    if-eqz p1, :cond_1

    .line 1636
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_0

    .line 1637
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->onDestroy()V

    .line 1638
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setVisibility(I)V

    .line 1639
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1641
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    .line 1642
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    .line 1644
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    if-eqz v0, :cond_4

    .line 1645
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1646
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    goto :goto_0

    .line 1651
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    if-eqz v0, :cond_2

    .line 1652
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 1653
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    .line 1655
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 1656
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1659
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    if-eqz v0, :cond_4

    .line 1660
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1661
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    .line 1665
    :cond_4
    :goto_0
    return-void
.end method

.method public a(ZII)V
    .locals 4

    .line 1668
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resolveOutterParams launchSource "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " sportType "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " isSelected "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1669
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 1670
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    .line 1671
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    if-eqz v0, :cond_0

    .line 1672
    invoke-static {}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d()V

    .line 1677
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 936
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1568
    const-string v0, "updateMap"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 1569
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->a(Landroid/content/Context;)V

    .line 1570
    invoke-static {}, Lo/cds;->a()Z

    move-result v1

    .line 1571
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eq v1, v0, :cond_1

    .line 1574
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e()V

    .line 1575
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Z)V

    .line 1577
    :cond_1
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 961
    return-void
.end method

.method public d(Landroid/location/Location;)V
    .locals 1

    .line 796
    if-nez p1, :cond_0

    .line 797
    return-void

    .line 800
    :cond_0
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Landroid/location/Location;)V

    .line 803
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 693
    if-eqz p1, :cond_0

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 696
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 699
    :goto_0
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o:Z

    .line 700
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o:Z

    if-nez v0, :cond_3

    .line 701
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i()V

    .line 703
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_2

    .line 704
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_5

    .line 705
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 708
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setVisibility(I)V

    .line 710
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->invalidate()V

    .line 712
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    if-eqz v0, :cond_5

    .line 713
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->removeMessages(I)V

    goto/16 :goto_1

    .line 718
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 719
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 720
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    if-eqz v0, :cond_5

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->removeMessages(I)V

    goto/16 :goto_1

    .line 728
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f()V

    .line 730
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_4

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_5

    .line 732
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 733
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setVisibility(I)V

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->invalidate()V

    .line 738
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    if-eqz v0, :cond_5

    .line 739
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->removeMessages(I)V

    .line 740
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 744
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 746
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 748
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    if-eqz v0, :cond_5

    .line 749
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->removeMessages(I)V

    .line 750
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->sendEmptyMessage(I)Z

    .line 756
    :cond_5
    :goto_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->B:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_6

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 760
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 764
    :goto_2
    return-void
.end method

.method public e()V
    .locals 6

    .line 1581
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->a(Landroid/content/Context;)V

    .line 1582
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    .line 1583
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_1

    .line 1585
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->map_layout_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    .line 1586
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1588
    new-instance v0, Lcom/amap/api/maps/TextureMapView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/amap/api/maps/TextureMapView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    .line 1589
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0, v1, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1591
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->H:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->onCreate(Landroid/os/Bundle;)V

    .line 1593
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->getMap()Lcom/amap/api/maps/AMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    .line 1594
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    if-eqz v0, :cond_0

    .line 1595
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v5

    .line 1596
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 1597
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 1598
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    .line 1599
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h()V

    .line 1600
    goto :goto_0

    .line 1601
    :cond_0
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1605
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/TextureMapView;->setVisibility(I)V

    .line 1606
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1607
    goto :goto_1

    .line 1608
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_google_map_fragment:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    .line 1609
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_3

    .line 1610
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 1611
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    if-eqz v0, :cond_2

    .line 1612
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 1613
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    .line 1615
    :cond_2
    invoke-static {}, Lcom/google/android/gms/maps/SupportMapFragment;->newInstance()Lcom/google/android/gms/maps/SupportMapFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    .line 1616
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->track_setting_map_google:I

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 1617
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r:Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    .line 1628
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1631
    :goto_1
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 951
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1561
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1562
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSportTip onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1565
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 678
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_setting:I

    if-ne v0, v1, :cond_0

    .line 679
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSportExtrasSettingView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    const-string v0, "onClick"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 682
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 683
    const-string v0, "currentFrag"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 684
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->startActivity(Landroid/content/Intent;)V

    .line 685
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 686
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->hI:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 690
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 208
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 209
    invoke-static {}, Lo/esg;->b()Lo/esg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    invoke-virtual {v0}, Lo/esg;->c()V

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    .line 215
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 221
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Enter onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    iput-object p3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->H:Landroid/os/Bundle;

    .line 226
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    .line 227
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->a(Landroid/content/Context;)V

    .line 229
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    .line 230
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->layout_frag_track_entrance_sport:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    .line 232
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 233
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    .line 235
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->A:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->P:Z

    if-eqz v0, :cond_0

    .line 236
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d()V

    .line 237
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAll in onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    :cond_0
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Leave onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 616
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_setting:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 621
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 622
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    const-string v0, "onDestroy"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Ljava/lang/String;)V

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Landroid/location/Location;)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->x:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->M:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_2

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/TextureMapView;->onDestroy()V

    .line 638
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    if-eqz v0, :cond_3

    .line 639
    const-string v0, "action_stop_play_sport_music"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Ljava/lang/String;)V

    .line 640
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    .line 643
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    invoke-virtual {v0}, Lo/esg;->a()V

    .line 645
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i()V

    .line 647
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 649
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    .line 652
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k:Landroid/widget/TextView;

    .line 653
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f:Landroid/widget/ImageView;

    .line 654
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->D:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    .line 655
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->E:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackWalkFragment;

    .line 656
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->F:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackBikeFragment;

    .line 657
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c:Lo/emq;

    .line 658
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    .line 659
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    .line 660
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->C:Landroid/app/Activity;

    .line 661
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i:Landroid/content/res/Resources;

    .line 662
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e:Landroid/support/v4/view/ViewPager;

    .line 663
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g:Landroid/widget/RelativeLayout;

    .line 664
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n:Landroid/widget/RelativeLayout;

    .line 665
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    .line 666
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->W:Lcom/amap/api/maps/model/Marker;

    .line 667
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d:Lo/ese;

    .line 668
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    .line 669
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l:Lcom/amap/api/maps/AMap;

    .line 670
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->x:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    .line 671
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->M:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;

    .line 672
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->S:Lo/dcy;

    .line 673
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->V:Lo/dhl;

    .line 674
    return-void
.end method

.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 5

    .line 1130
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMapReady "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1131
    if-nez p1, :cond_0

    .line 1132
    return-void

    .line 1134
    :cond_0
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    .line 1135
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    .line 1136
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v4

    .line 1137
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 1138
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 1139
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    if-eqz v0, :cond_1

    .line 1140
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Landroid/location/Location;)V

    .line 1143
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n()V

    .line 1145
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 564
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 565
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    .line 571
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u()V

    .line 580
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 584
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 585
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->v:Z

    .line 587
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->T:Z

    .line 588
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Enter onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->A:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->L:Z

    if-eqz v0, :cond_0

    .line 590
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r()V

    .line 592
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->K:I

    invoke-virtual {v0, v1, v2}, Lo/esg;->d(II)V

    .line 596
    :cond_0
    const-string v0, "TimeEat_SportEntranceFragment"

    const-string v1, "Leave onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 597
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 602
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 603
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSaveInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h:Lcom/amap/api/maps/TextureMapView;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/TextureMapView;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 606
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGaodeMapView onSaveInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    :cond_0
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 5

    .line 1468
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 1469
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1470
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->L:Z

    .line 1471
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->I:Landroid/view/View;

    if-nez v0, :cond_1

    .line 1472
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint rootView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1473
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->L:Z

    if-eqz v0, :cond_0

    .line 1474
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->P:Z

    .line 1476
    :cond_0
    return-void

    .line 1479
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->R:Ljava/lang/String;

    const-string v2, "EXIT_APP_AT_SPORT_TAB"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->S:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1481
    if-eqz p1, :cond_4

    .line 1482
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p()V

    .line 1483
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->A:Z

    if-eqz v0, :cond_2

    .line 1484
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d()V

    .line 1485
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAll in setUserVisibleHint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1487
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r()V

    .line 1488
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c()V

    .line 1490
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    .line 1491
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->G:Lo/esg;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->N:I

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->K:I

    invoke-virtual {v0, v1, v2}, Lo/esg;->d(II)V

    .line 1494
    :cond_3
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->P:Z

    .line 1495
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a()V

    goto :goto_1

    .line 1498
    :cond_4
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u()V

    .line 1500
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    if-eqz v0, :cond_5

    .line 1501
    const-string v0, "action_stop_play_sport_music"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Ljava/lang/String;)V

    .line 1502
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->J:Z

    .line 1506
    :cond_5
    :goto_1
    return-void
.end method
