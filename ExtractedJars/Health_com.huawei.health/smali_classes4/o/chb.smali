.class public Lo/chb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cha;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/chb$b;,
        Lo/chb$c;
    }
.end annotation


# static fields
.field private static g:Ljava/lang/Boolean;


# instance fields
.field private A:Landroid/os/Handler;

.field private B:Lo/cha$b;

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[Lcom/google/android/gms/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private a:Lcom/google/android/gms/maps/model/PolylineOptions;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/maps/GoogleMap;

.field private e:Lcom/google/android/gms/maps/model/Polyline;

.field private f:Lcom/google/android/gms/maps/model/Marker;

.field private h:Lcom/google/android/gms/maps/model/Marker;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private k:Lcom/google/android/gms/maps/model/Marker;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/google/android/gms/maps/model/Marker;>;"
        }
    .end annotation
.end field

.field private m:Lo/chb$c;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/chb$b;>;"
        }
    .end annotation
.end field

.field private r:Lcom/google/android/gms/maps/CameraUpdate;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;>;"
        }
    .end annotation
.end field

.field private w:Lcom/google/android/gms/maps/model/LatLng;

.field private x:Lcom/google/android/gms/maps/model/LatLng;

.field private y:Lcom/google/android/gms/maps/model/PolylineOptions;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lo/chb;->g:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 4

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chb;->f:Lcom/google/android/gms/maps/model/Marker;

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chb;->o:Z

    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chb;->p:Z

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chb;->n:Z

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->l:Ljava/util/ArrayList;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/chb;->t:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/chb;->u:I

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    .line 300
    new-instance v0, Lo/chb$1;

    invoke-direct {v0, p0}, Lo/chb$1;-><init>(Lo/chb;)V

    iput-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    .line 104
    if-nez p1, :cond_0

    .line 105
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GoogleMapModel context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void

    .line 108
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->b:Landroid/content/Context;

    .line 109
    iput-object p2, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    .line 110
    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 111
    iget-object v0, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    sget v1, Lo/cdw;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 112
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 113
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->zIndex(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 114
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->visible(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->i:Ljava/util/List;

    .line 116
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->e:Lcom/google/android/gms/maps/model/Polyline;

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->c:Ljava/util/List;

    .line 118
    new-instance v0, Lo/chb$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/chb$c;-><init>(Lo/chb;Lo/chb$1;)V

    iput-object v0, p0, Lo/chb;->m:Lo/chb$c;

    .line 119
    return-void
.end method

.method private a(Ljava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;Z)V"
        }
    .end annotation

    .line 594
    if-eqz p2, :cond_3

    .line 595
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 596
    :cond_0
    return-void

    .line 598
    :cond_1
    new-instance v6, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 599
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    .line 600
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    .line 601
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 600
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 603
    :cond_2
    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    iget-object v1, p0, Lo/chb;->b:Landroid/content/Context;

    .line 604
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/chb;->b:Landroid/content/Context;

    .line 605
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    div-double/2addr v2, v4

    double-to-int v2, v2

    .line 603
    const/16 v3, 0xa

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    .line 607
    goto :goto_1

    .line 608
    :cond_3
    invoke-virtual {p0, p1}, Lo/chb;->a(Ljava/util/List;)V

    .line 610
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/chb;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/chb;->f()V

    return-void
.end method

.method static synthetic b(Lo/chb;)Lcom/google/android/gms/maps/model/Marker;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    return-object v0
.end method

.method private b(I)V
    .locals 5

    .line 289
    const-wide/16 v2, 0x384

    .line 290
    invoke-virtual {p0}, Lo/chb;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 294
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 295
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 296
    iput p1, v4, Landroid/os/Message;->what:I

    .line 297
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 298
    return-void
.end method

.method static synthetic b(Lo/chb;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lo/chb;->n:Z

    return p1
.end method

.method static synthetic c(Lo/chb;)Lcom/google/android/gms/maps/model/Polyline;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/chb;->e:Lcom/google/android/gms/maps/model/Polyline;

    return-object v0
.end method

.method private c(Ljava/util/List;Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 900
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 901
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->size()I

    move-result v5

    .line 902
    new-array v6, v5, [Ljava/lang/Integer;

    .line 903
    new-array v7, v5, [Ljava/lang/Integer;

    .line 905
    const/4 v8, 0x0

    .line 906
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 908
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 910
    invoke-static {v11}, Lo/cds;->g(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 911
    goto :goto_0

    .line 914
    :cond_0
    const v0, 0x186a0

    if-le v11, v0, :cond_1

    .line 917
    const v0, 0x186a0

    rem-int v0, v11, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v8

    .line 918
    const v0, 0x186a0

    div-int v0, v11, v0

    div-int/lit8 v0, v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    goto :goto_1

    .line 923
    :cond_1
    add-int/lit8 v0, v11, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v8

    .line 924
    add-int/lit8 v0, v8, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    .line 926
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 927
    goto :goto_0

    .line 929
    :cond_2
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_7

    .line 931
    :try_start_0
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 934
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/chb;->u:I

    if-le v0, v1, :cond_3

    .line 936
    iget v0, p0, Lo/chb;->u:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 937
    iget v10, p0, Lo/chb;->u:I

    goto :goto_3

    .line 938
    :cond_3
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/chb;->t:I

    if-ge v0, v1, :cond_4

    .line 939
    iget v0, p0, Lo/chb;->t:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 940
    iget v10, p0, Lo/chb;->t:I

    goto :goto_3

    .line 942
    :cond_4
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 944
    :goto_3
    new-instance v12, Lo/chb$b;

    invoke-direct {v12}, Lo/chb$b;-><init>()V

    .line 945
    invoke-static {v12, v11}, Lo/chb$b;->d(Lo/chb$b;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    .line 946
    const/4 v0, 0x1

    invoke-static {v12, v0}, Lo/chb$b;->d(Lo/chb$b;Z)Z

    .line 947
    aget-object v0, v7, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v12, v0}, Lo/chb$b;->e(Lo/chb$b;I)I

    .line 949
    iget-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 951
    iget-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/chb$b;

    .line 952
    invoke-static {v13}, Lo/chb$b;->c(Lo/chb$b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 957
    iget v0, p0, Lo/chb;->u:I

    if-ne v10, v0, :cond_5

    .line 958
    const/4 v0, 0x0

    invoke-static {v12, v0}, Lo/chb$b;->d(Lo/chb$b;Z)Z

    goto :goto_4

    .line 960
    :cond_5
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lo/chb$b;->d(Lo/chb$b;Z)Z

    .line 965
    :cond_6
    :goto_4
    iget-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 968
    goto :goto_5

    .line 966
    :catch_0
    move-exception v10

    .line 967
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUpKmLatLngList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 929
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 971
    :cond_7
    return-void
.end method

.method private c(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;Z)V"
        }
    .end annotation

    .line 391
    if-nez p1, :cond_0

    .line 392
    return-void

    .line 395
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    :goto_0
    if-ltz v5, :cond_3

    .line 396
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/maps/model/LatLng;

    .line 397
    invoke-static {v4}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 398
    if-eqz p2, :cond_1

    .line 399
    iput-object v4, p0, Lo/chb;->x:Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_1

    .line 401
    :cond_1
    invoke-virtual {p0, v4}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 403
    :goto_1
    iput v5, p0, Lo/chb;->u:I

    .line 404
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addEndMarker"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    goto :goto_2

    .line 395
    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 408
    :cond_3
    :goto_2
    return-void
.end method

.method public static c(Z)V
    .locals 1

    .line 814
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lo/chb;->g:Ljava/lang/Boolean;

    .line 815
    return-void
.end method

.method static synthetic c(Lo/chb;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lo/chb;->o:Z

    return p1
.end method

.method private d(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/PointF;
    .locals 4

    .line 513
    new-instance v0, Landroid/graphics/PointF;

    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    double-to-float v1, v1

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    double-to-float v2, v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method private d(Ljava/util/List;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;IZ)V"
        }
    .end annotation

    .line 410
    if-nez p1, :cond_0

    .line 411
    return-void

    .line 413
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 416
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_4

    .line 417
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/maps/model/LatLng;

    .line 418
    invoke-static {v5}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 419
    if-eqz p3, :cond_1

    .line 420
    iput-object v5, p0, Lo/chb;->w:Lcom/google/android/gms/maps/model/LatLng;

    .line 421
    iput p2, p0, Lo/chb;->z:I

    goto :goto_1

    .line 423
    :cond_1
    invoke-virtual {p0, v5, p2}, Lo/chb;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    .line 425
    :goto_1
    iput v6, p0, Lo/chb;->t:I

    .line 426
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 427
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    invoke-direct {p0, v5}, Lo/chb;->d(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 429
    :cond_2
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStartMarker"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    goto :goto_2

    .line 416
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 434
    :cond_4
    :goto_2
    return-void
.end method

.method private d(Ljava/util/List;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;Z)V"
        }
    .end annotation

    .line 438
    new-instance v4, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v4}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 439
    sget v0, Lo/cdw;->c:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 440
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 441
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->zIndex(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 442
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->visible(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 443
    if-eqz p2, :cond_0

    .line 444
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->v:Ljava/util/List;

    .line 445
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->D:Ljava/util/List;

    .line 446
    iput-object v4, p0, Lo/chb;->y:Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 450
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    .line 452
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 453
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_6

    .line 454
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/maps/model/LatLng;

    .line 455
    invoke-static {v6}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 458
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 459
    if-eqz p2, :cond_1

    .line 460
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 461
    invoke-interface {v9, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 462
    iget-object v0, p0, Lo/chb;->v:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    goto :goto_1

    .line 464
    :cond_1
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 466
    :goto_1
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 467
    const/4 v9, 0x1

    .line 468
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 469
    if-eqz v9, :cond_2

    .line 470
    const/4 v9, 0x0

    goto :goto_3

    .line 472
    :cond_2
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    invoke-direct {p0, v11}, Lo/chb;->d(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    :goto_3
    goto :goto_2

    .line 476
    :cond_3
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 480
    :cond_4
    invoke-direct {p0, p1, v8, p2}, Lo/chb;->e(Ljava/util/List;IZ)V

    goto :goto_4

    .line 484
    :cond_5
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 453
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 488
    :cond_6
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 491
    if-eqz p2, :cond_7

    .line 492
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 493
    invoke-interface {v8, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 494
    iget-object v0, p0, Lo/chb;->v:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    goto :goto_5

    .line 496
    :cond_7
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 498
    :goto_5
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    if-eqz v0, :cond_9

    .line 499
    const/4 v8, 0x1

    .line 500
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/google/android/gms/maps/model/LatLng;

    .line 501
    if-eqz v8, :cond_8

    .line 502
    const/4 v8, 0x0

    goto :goto_7

    .line 504
    :cond_8
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    invoke-direct {p0, v10}, Lo/chb;->d(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    :goto_7
    goto :goto_6

    .line 510
    :cond_9
    return-void
.end method

.method static synthetic d(Lo/chb;)Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lo/chb;->n:Z

    return v0
.end method

.method static synthetic e(Lo/chb;)Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    return-object v0
.end method

.method private e(Ljava/util/List;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;IZ)V"
        }
    .end annotation

    .line 523
    if-nez p1, :cond_0

    .line 524
    return-void

    .line 527
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 528
    const/4 v5, 0x0

    .line 529
    const/4 v6, 0x0

    .line 531
    if-lez p2, :cond_1

    .line 533
    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/maps/model/LatLng;

    .line 534
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pauseStart ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    :cond_1
    add-int/lit8 v0, v4, -0x1

    if-ge p2, v0, :cond_2

    .line 538
    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/maps/model/LatLng;

    .line 539
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pauseEnd ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 543
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMapLoaded list index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",pauseStart = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",pauseEnd = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    if-eqz p3, :cond_3

    .line 547
    iget-object v0, p0, Lo/chb;->D:Ljava/util/List;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 549
    :cond_3
    invoke-virtual {p0, v5, v6}, Lo/chb;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 551
    :goto_0
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 552
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    invoke-direct {p0, v6}, Lo/chb;->d(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    :cond_4
    return-void
.end method

.method static synthetic e(Lo/chb;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/chb;->b(I)V

    return-void
.end method

.method private f()V
    .locals 2

    .line 689
    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 690
    iget-object v0, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    sget v1, Lo/cdw;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 691
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 692
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->zIndex(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 693
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->visible(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 694
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->e:Lcom/google/android/gms/maps/model/Polyline;

    .line 695
    iget-object v0, p0, Lo/chb;->c:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/chb;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 696
    iget-object v0, p0, Lo/chb;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 698
    :cond_0
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 699
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 701
    :cond_1
    return-void
.end method

.method private l()V
    .locals 10

    .line 995
    const/4 v6, 0x1

    .line 996
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "indexInterval = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 998
    iget-object v0, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/chb$b;

    invoke-static {v0}, Lo/chb$b;->b(Lo/chb$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 999
    iget-object v0, p0, Lo/chb;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lo/chb;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/chb$b;

    invoke-static {v1}, Lo/chb$b;->c(Lo/chb$b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    add-int/lit8 v2, v7, 0x1

    int-to-double v2, v2

    .line 1000
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    .line 999
    invoke-static {v0, v1, v2}, Lo/cdr;->b(Landroid/content/res/Resources;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v8

    .line 1001
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v9

    .line 1002
    iget-object v0, p0, Lo/chb;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1005
    :cond_1
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMarkersList.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/chb;->l:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    return-void
.end method

.method private n()V
    .locals 3

    .line 1009
    iget-object v0, p0, Lo/chb;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/maps/model/Marker;

    .line 1010
    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 1011
    goto :goto_0

    .line 1012
    :cond_0
    iget-object v0, p0, Lo/chb;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1013
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 737
    return-void
.end method

.method public a(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V
    .locals 1

    .line 769
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    .line 770
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    .line 771
    return-void

    .line 773
    :cond_0
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    .line 774
    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;I)V
    .locals 2

    .line 240
    if-nez p1, :cond_0

    .line 241
    return-void

    .line 243
    :cond_0
    iget-object v0, p0, Lo/chb;->k:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_1

    .line 244
    iget-object v0, p0, Lo/chb;->k:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 246
    :cond_1
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {p1}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lo/cdr;->d(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;I)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->k:Lcom/google/android/gms/maps/model/Marker;

    .line 247
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;)V"
        }
    .end annotation

    .line 614
    new-instance v6, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 615
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    .line 616
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 617
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 616
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 619
    :cond_0
    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    iget-object v1, p0, Lo/chb;->b:Landroid/content/Context;

    .line 620
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/chb;->b:Landroid/content/Context;

    .line 621
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    div-double/2addr v2, v4

    double-to-int v2, v2

    .line 619
    const/16 v3, 0xa

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    .line 623
    const/4 v0, 0x1

    if-le v7, v0, :cond_1

    .line 624
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 628
    :cond_1
    return-void
.end method

.method public a(Lo/cew;)V
    .locals 0

    .line 680
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 752
    iput-boolean p1, p0, Lo/chb;->p:Z

    .line 755
    if-nez p1, :cond_0

    .line 756
    return-void

    .line 759
    :cond_0
    invoke-virtual {p0}, Lo/chb;->i()V

    .line 761
    return-void
.end method

.method public b()V
    .locals 0

    .line 731
    return-void
.end method

.method public b(Landroid/os/Handler;Lo/cew;Z)V
    .locals 11

    .line 326
    invoke-virtual {p2}, Lo/cew;->b()Ljava/util/Map;

    move-result-object v4

    .line 327
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 328
    :cond_0
    if-eqz p3, :cond_1

    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    if-eqz v0, :cond_1

    .line 329
    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    invoke-interface {v0}, Lo/cha$b;->e()V

    .line 331
    :cond_1
    return-void

    .line 333
    :cond_2
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMotionPathPointsBuffer = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 335
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 336
    if-eqz p3, :cond_3

    .line 337
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/chb;->s:Ljava/util/List;

    .line 340
    :cond_3
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 342
    new-instance v9, Lcom/google/android/gms/maps/model/LatLng;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [D

    const/4 v3, 0x1

    aget-wide v2, v2, v3

    invoke-direct {v9, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 343
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 344
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/google/android/gms/maps/model/LatLng;

    .line 345
    invoke-static {v10}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    .line 346
    invoke-static {v9}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    .line 345
    invoke-static {v0, v1}, Lo/cdr;->b(Lo/cgk;Lo/cgk;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 347
    goto :goto_0

    .line 351
    :cond_4
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    invoke-static {v9}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 354
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    :cond_5
    goto/16 :goto_0

    .line 358
    :cond_6
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list SIZE:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_8

    sget-object v0, Lo/chb;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 362
    if-eqz p3, :cond_7

    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    if-eqz v0, :cond_7

    .line 363
    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    invoke-interface {v0}, Lo/cha$b;->e()V

    .line 365
    :cond_7
    return-void

    .line 369
    :cond_8
    invoke-direct {p0, v6, p3}, Lo/chb;->d(Ljava/util/List;Z)V

    .line 372
    invoke-virtual {p2}, Lo/cew;->o()I

    move-result v7

    .line 375
    invoke-direct {p0, v6, v7, p3}, Lo/chb;->d(Ljava/util/List;IZ)V

    .line 376
    invoke-direct {p0, v6, p3}, Lo/chb;->c(Ljava/util/List;Z)V

    .line 378
    invoke-direct {p0, v5, p3}, Lo/chb;->a(Ljava/util/List;Z)V

    .line 383
    invoke-virtual {p2}, Lo/cew;->d()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v6, v0}, Lo/chb;->c(Ljava/util/List;Ljava/util/Map;)V

    .line 384
    if-eqz p3, :cond_9

    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    if-eqz v0, :cond_9

    .line 385
    iget-object v0, p0, Lo/chb;->B:Lo/cha$b;

    invoke-interface {v0}, Lo/cha$b;->a()V

    .line 387
    :cond_9
    return-void
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;JLcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    .locals 5

    .line 137
    if-nez p1, :cond_0

    .line 138
    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_1

    .line 141
    return-void

    .line 144
    :cond_1
    iget-boolean v0, p0, Lo/chb;->o:Z

    if-eqz v0, :cond_3

    .line 145
    const/high16 v2, 0x41840000    # 16.5f

    .line 146
    if-nez p4, :cond_2

    .line 147
    iget-object p4, p0, Lo/chb;->m:Lo/chb$c;

    goto :goto_0

    .line 149
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/chb;->o:Z

    goto :goto_0

    .line 152
    :cond_3
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    if-nez v0, :cond_4

    .line 153
    return-void

    .line 155
    :cond_4
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v2, v0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    .line 157
    :goto_0
    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;-><init>()V

    .line 158
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->target(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CameraPosition$Builder;

    move-result-object v0

    .line 159
    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->zoom(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;

    move-result-object v0

    .line 160
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->bearing(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;

    move-result-object v0

    .line 161
    const/high16 v1, 0x41c80000    # 25.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->tilt(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->build()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v3

    .line 163
    invoke-static {v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v4

    .line 164
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v4, p4}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    .line 165
    return-void
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    .line 219
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 220
    invoke-virtual {p0, p2}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 222
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/chb;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 223
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 673
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 675
    return-void
.end method

.method public c()V
    .locals 2

    .line 685
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 686
    return-void
.end method

.method public c(Landroid/os/Handler;Lo/cew;)V
    .locals 5

    .line 632
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    .line 633
    const/4 v0, 0x1

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 634
    return-void

    .line 636
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chb;->n:Z

    .line 637
    new-instance v3, Lo/chb$3;

    invoke-direct {v3, p0, p1}, Lo/chb$3;-><init>(Lo/chb;Landroid/os/Handler;)V

    .line 651
    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 652
    new-instance v4, Lo/chb$2;

    invoke-direct {v4, p0, p1, v3}, Lo/chb$2;-><init>(Lo/chb;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 668
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    .line 669
    return-void
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 23

    .line 777
    if-nez p2, :cond_0

    .line 778
    return-void

    .line 780
    :cond_0
    move-object/from16 v0, p2

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-object/from16 v2, p1

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double v7, v0, v2

    .line 781
    move-object/from16 v0, p2

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-object/from16 v2, p1

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    sub-double v9, v0, v2

    .line 782
    const-wide/high16 v11, 0x4032000000000000L    # 18.0

    .line 783
    const/4 v13, 0x0

    .line 785
    div-double v14, v7, v11

    .line 786
    div-double v16, v9, v11

    .line 787
    move-object/from16 v18, p1

    .line 788
    const/16 v19, 0x12

    .line 790
    const/16 v21, 0x0

    :goto_0
    move/from16 v0, v21

    move/from16 v1, v19

    if-ge v0, v1, :cond_2

    .line 791
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomNew = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 792
    if-lez v21, :cond_1

    .line 793
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v1, v18

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide/high16 v3, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v3, v14

    add-double/2addr v1, v3

    move-object/from16 v3, v18

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    mul-double v5, v5, v16

    add-double/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object/from16 v20, v0

    .line 794
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loopLatLng = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 796
    :cond_1
    move-object/from16 v20, v18

    .line 799
    :goto_1
    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    move-object/from16 v22, v0

    .line 800
    const/16 v13, 0xf

    .line 802
    sget v0, Lo/cdw;->b:I

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 803
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 804
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->zIndex(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 805
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->visible(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 806
    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v2, v18

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    add-double/2addr v2, v14

    move-object/from16 v4, v18

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    add-double v4, v4, v16

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 807
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 808
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    .line 809
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v1, v18

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    add-double/2addr v1, v14

    move-object/from16 v3, v18

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    add-double v3, v3, v16

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object/from16 v18, v0

    .line 790
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_0

    .line 811
    :cond_2
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cgn;>;)V"
        }
    .end annotation

    .line 183
    if-nez p1, :cond_0

    .line 184
    return-void

    .line 186
    :cond_0
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cgn;

    invoke-virtual {v1}, Lo/cgn;->d()Lo/cgk;

    move-result-object v1

    invoke-static {v1}, Lo/cdr;->c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    iget-boolean v0, p0, Lo/chb;->p:Z

    if-eqz v0, :cond_1

    .line 188
    iget-object v0, p0, Lo/chb;->e:Lcom/google/android/gms/maps/model/Polyline;

    iget-object v1, p0, Lo/chb;->i:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 189
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    iget-object v1, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 191
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    iget-object v1, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v1, 0x3e8

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/chb;->b(Lcom/google/android/gms/maps/model/LatLng;JLcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    .line 196
    :cond_1
    return-void
.end method

.method public c(Lo/cha$b;)V
    .locals 0

    .line 582
    iput-object p1, p0, Lo/chb;->B:Lo/cha$b;

    .line 583
    return-void
.end method

.method public d()V
    .locals 0

    .line 748
    return-void
.end method

.method public d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    .line 200
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawLine<>lastLatLng:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " currentLatLng:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 202
    invoke-virtual {p0, p2}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 205
    :cond_0
    new-instance v4, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v4}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 207
    sget v0, Lo/cdw;->c:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 208
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 209
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->zIndex(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 210
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->visible(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 211
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->add([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 213
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    .line 214
    return-void
.end method

.method public e()V
    .locals 4

    .line 558
    iget-object v0, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    if-eqz v0, :cond_0

    .line 559
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 561
    :cond_0
    iget-object v0, p0, Lo/chb;->w:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_1

    .line 562
    iget-object v0, p0, Lo/chb;->w:Lcom/google/android/gms/maps/model/LatLng;

    iget v1, p0, Lo/chb;->z:I

    invoke-virtual {p0, v0, v1}, Lo/chb;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    .line 564
    :cond_1
    iget-object v0, p0, Lo/chb;->x:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_2

    .line 565
    iget-object v0, p0, Lo/chb;->x:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 567
    :cond_2
    iget-object v0, p0, Lo/chb;->v:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/chb;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 568
    iget-object v0, p0, Lo/chb;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 569
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->y:Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 570
    goto :goto_0

    .line 572
    :cond_3
    iget-object v0, p0, Lo/chb;->D:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/chb;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 573
    iget-object v0, p0, Lo/chb;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Lcom/google/android/gms/maps/model/LatLng;

    .line 574
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-virtual {p0, v0, v1}, Lo/chb;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 575
    goto :goto_1

    .line 578
    :cond_4
    return-void
.end method

.method public e(I)V
    .locals 4

    .line 589
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    .line 590
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mapType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/GoogleMap;->getMapType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    return-void
.end method

.method public e(Landroid/os/Bundle;ZZ)V
    .locals 8

    .line 705
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 708
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 711
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 714
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setCompassEnabled(Z)V

    .line 717
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setTiltGesturesEnabled(Z)V

    .line 719
    if-eqz p2, :cond_0

    .line 720
    iget-object v0, p0, Lo/chb;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 721
    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    .line 722
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 723
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget v1, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    iget v2, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v2, v2, 0x4

    iget v3, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v3, v3, 0x2

    iget v4, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->setPadding(IIII)V

    .line 726
    :cond_0
    return-void
.end method

.method public e(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4

    .line 252
    if-nez p1, :cond_0

    .line 253
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateMarkers latlng == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Lo/chb;->f:Lcom/google/android/gms/maps/model/Marker;

    if-nez v0, :cond_3

    .line 258
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {p1}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cdr;->d(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    .line 259
    sget-object v0, Lo/chb;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 261
    iget-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 262
    iget-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    .line 266
    :cond_1
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 267
    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    .line 268
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    .line 269
    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_ending:I

    .line 270
    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    .line 267
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->f:Lcom/google/android/gms/maps/model/Marker;

    goto :goto_0

    .line 272
    :cond_2
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {p1}, Lo/cdr;->e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cdr;->b(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/chb;->f:Lcom/google/android/gms/maps/model/Marker;

    .line 273
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/chb;->b(I)V

    goto :goto_0

    .line 278
    :cond_3
    iget-object v0, p0, Lo/chb;->f:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 280
    iget-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 281
    iget-object v0, p0, Lo/chb;->h:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 286
    :cond_4
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 839
    if-eqz p1, :cond_0

    .line 840
    invoke-direct {p0}, Lo/chb;->l()V

    goto :goto_0

    .line 842
    :cond_0
    invoke-direct {p0}, Lo/chb;->n()V

    .line 844
    :goto_0
    return-void
.end method

.method public g()V
    .locals 2

    .line 822
    iget-object v0, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    if-eqz v0, :cond_0

    .line 823
    iget-object v0, p0, Lo/chb;->d:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v1, p0, Lo/chb;->r:Lcom/google/android/gms/maps/CameraUpdate;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 825
    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    .line 818
    sget-object v0, Lo/chb;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public i()V
    .locals 2

    .line 829
    iget-object v0, p0, Lo/chb;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 830
    return-void

    .line 833
    :cond_0
    iget-object v0, p0, Lo/chb;->A:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 834
    return-void
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation

    .line 848
    iget-object v0, p0, Lo/chb;->s:Ljava/util/List;

    return-object v0
.end method
