.class public final Lcom/tencent/map/b/d$a;
.super Landroid/telephony/PhoneStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/map/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/reflect/Method;

.field private j:Ljava/lang/reflect/Method;

.field private k:Ljava/lang/reflect/Method;

.field private l:Ljava/lang/reflect/Method;

.field private m:Ljava/lang/reflect/Method;

.field private synthetic n:Lcom/tencent/map/b/d;


# direct methods
.method public constructor <init>(Lcom/tencent/map/b/d;II)V
    .locals 1

    iput-object p1, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/d$a;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/d$a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/d$a;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/d$a;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/d$a;->e:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/d$a;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Lcom/tencent/map/b/d$a;->g:I

    const v0, 0x7fffffff

    iput v0, p0, Lcom/tencent/map/b/d$a;->h:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d$a;->i:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d$a;->j:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d$a;->k:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d$a;->l:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d$a;->m:Ljava/lang/reflect/Method;

    iput p2, p0, Lcom/tencent/map/b/d$a;->b:I

    iput p3, p0, Lcom/tencent/map/b/d$a;->a:I

    return-void
.end method


# virtual methods
.method public final onCellLocationChanged(Landroid/telephony/CellLocation;)V
    .locals 14

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/d$a;->f:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/d$a;->e:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/d$a;->d:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/d$a;->c:I

    if-eqz p1, :cond_4

    iget v0, p0, Lcom/tencent/map/b/d$a;->a:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    move-object v11, p1

    move-object p1, p0

    const/4 v13, 0x0

    move-object v0, v11

    :try_start_0
    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    move-object v13, v0

    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {v13}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->d(Lcom/tencent/map/b/d;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, v0

    :cond_0
    const/4 v12, 0x1

    goto :goto_0

    :catch_0
    const/4 v12, 0x0

    :goto_0
    if-eqz v12, :cond_2

    if-eqz v13, :cond_2

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->d(Lcom/tencent/map/b/d;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1

    :try_start_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->c:I

    :cond_1
    invoke-virtual {v13}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->d:I

    invoke-virtual {v13}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->e:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->e:I

    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->d:I

    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->c:I

    :goto_1
    iget-object v0, p1, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->c(Lcom/tencent/map/b/d;)V

    :cond_2
    goto/16 :goto_2

    :sswitch_1
    move-object v11, p1

    move-object p1, p0

    const/4 v12, 0x0

    move-object v12, v11

    const/4 v13, 0x1

    if-eqz v12, :cond_4

    if-eqz v13, :cond_4

    :try_start_2
    iget-object v0, p1, Lcom/tencent/map/b/d$a;->i:Ljava/lang/reflect/Method;

    if-nez v0, :cond_3

    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getBaseStationId"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/map/b/d$a;->i:Ljava/lang/reflect/Method;

    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getSystemId"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/map/b/d$a;->j:Ljava/lang/reflect/Method;

    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getNetworkId"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/map/b/d$a;->k:Ljava/lang/reflect/Method;

    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getBaseStationLatitude"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/map/b/d$a;->l:Ljava/lang/reflect/Method;

    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getBaseStationLongitude"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/map/b/d$a;->m:Ljava/lang/reflect/Method;

    :cond_3
    iget-object v0, p1, Lcom/tencent/map/b/d$a;->j:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->c:I

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->k:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->d:I

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->i:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->e:I

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->l:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->g:I

    iget-object v0, p1, Lcom/tencent/map/b/d$a;->m:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/tencent/map/b/d$a;->h:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->e:I

    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->d:I

    const/4 v0, -0x1

    iput v0, p1, Lcom/tencent/map/b/d$a;->c:I

    const v0, 0x7fffffff

    iput v0, p1, Lcom/tencent/map/b/d$a;->g:I

    const v0, 0x7fffffff

    iput v0, p1, Lcom/tencent/map/b/d$a;->h:I

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    new-instance v1, Lcom/tencent/map/b/d$b;

    iget-object v2, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    iget v3, p0, Lcom/tencent/map/b/d$a;->a:I

    iget v4, p0, Lcom/tencent/map/b/d$a;->b:I

    iget v5, p0, Lcom/tencent/map/b/d$a;->c:I

    iget v6, p0, Lcom/tencent/map/b/d$a;->d:I

    iget v7, p0, Lcom/tencent/map/b/d$a;->e:I

    iget v8, p0, Lcom/tencent/map/b/d$a;->f:I

    iget v9, p0, Lcom/tencent/map/b/d$a;->g:I

    iget v10, p0, Lcom/tencent/map/b/d$a;->h:I

    invoke-direct/range {v1 .. v10}, Lcom/tencent/map/b/d$b;-><init>(Lcom/tencent/map/b/d;IIIIIIII)V

    invoke-static {v0, v1}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;Lcom/tencent/map/b/d$b;)Lcom/tencent/map/b/d$b;

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$c;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$c;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v1}, Lcom/tencent/map/b/d;->b(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/map/b/d$c;->a(Lcom/tencent/map/b/d$b;)V

    :cond_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onSignalStrengthChanged(I)V
    .locals 11

    iget v0, p0, Lcom/tencent/map/b/d$a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->c(Lcom/tencent/map/b/d;)V

    :cond_0
    iget v0, p0, Lcom/tencent/map/b/d$a;->f:I

    add-int/lit8 v0, v0, 0x71

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    iget v0, p0, Lcom/tencent/map/b/d$a;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    shl-int/lit8 v0, p1, 0x1

    add-int/lit8 v0, v0, -0x71

    iput v0, p0, Lcom/tencent/map/b/d$a;->f:I

    return-void

    :cond_1
    shl-int/lit8 v0, p1, 0x1

    add-int/lit8 v0, v0, -0x71

    iput v0, p0, Lcom/tencent/map/b/d$a;->f:I

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    new-instance v1, Lcom/tencent/map/b/d$b;

    iget-object v2, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    iget v3, p0, Lcom/tencent/map/b/d$a;->a:I

    iget v4, p0, Lcom/tencent/map/b/d$a;->b:I

    iget v5, p0, Lcom/tencent/map/b/d$a;->c:I

    iget v6, p0, Lcom/tencent/map/b/d$a;->d:I

    iget v7, p0, Lcom/tencent/map/b/d$a;->e:I

    iget v8, p0, Lcom/tencent/map/b/d$a;->f:I

    iget v9, p0, Lcom/tencent/map/b/d$a;->g:I

    iget v10, p0, Lcom/tencent/map/b/d$a;->h:I

    invoke-direct/range {v1 .. v10}, Lcom/tencent/map/b/d$b;-><init>(Lcom/tencent/map/b/d;IIIIIIII)V

    invoke-static {v0, v1}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;Lcom/tencent/map/b/d$b;)Lcom/tencent/map/b/d$b;

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$c;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$c;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/d$a;->n:Lcom/tencent/map/b/d;

    invoke-static {v1}, Lcom/tencent/map/b/d;->b(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/map/b/d$c;->a(Lcom/tencent/map/b/d$b;)V

    :cond_2
    return-void
.end method
