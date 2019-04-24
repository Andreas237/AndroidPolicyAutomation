.class public Lnet/sourceforge/zbar/Symbol;
.super Ljava/lang/Object;


# static fields
.field public static final CODABAR:I = 0x26

.field public static final CODE128:I = 0x80

.field public static final CODE39:I = 0x27

.field public static final CODE93:I = 0x5d

.field public static final DATABAR:I = 0x22

.field public static final DATABAR_EXP:I = 0x23

.field public static final EAN13:I = 0xd

.field public static final EAN8:I = 0x8

.field public static final I25:I = 0x19

.field public static final ISBN10:I = 0xa

.field public static final ISBN13:I = 0xe

.field public static final NONE:I = 0x0

.field public static final PARTIAL:I = 0x1

.field public static final PDF417:I = 0x39

.field public static final QRCODE:I = 0x40

.field public static final UPCA:I = 0xc

.field public static final UPCE:I = 0x9


# instance fields
.field private peer:J

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "zbarjni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lnet/sourceforge/zbar/Symbol;->init()V

    return-void
.end method

.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    return-void
.end method

.method private native destroy(J)V
.end method

.method private native getComponents(J)J
.end method

.method private native getLocationSize(J)I
.end method

.method private native getLocationX(JI)I
.end method

.method private native getLocationY(JI)I
.end method

.method private native getType(J)I
.end method

.method private static native init()V
.end method


# virtual methods
.method public declared-synchronized destroy()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v0, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v0, v1}, Lnet/sourceforge/zbar/Symbol;->destroy(J)V

    iput-wide v2, p0, Lnet/sourceforge/zbar/Symbol;->peer:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected finalize()V
    .locals 0

    invoke-virtual {p0}, Lnet/sourceforge/zbar/Symbol;->destroy()V

    return-void
.end method

.method public getBounds()[I
    .locals 10

    iget-wide v0, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v0, v1}, Lnet/sourceforge/zbar/Symbol;->getLocationSize(J)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x4

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/high16 v3, -0x80000000

    const v4, 0x7fffffff

    const/4 v3, 0x0

    const v5, 0x7fffffff

    const/high16 v6, -0x80000000

    const/high16 v7, -0x80000000

    :goto_0
    if-ge v3, v0, :cond_5

    iget-wide v8, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v8, v9, v3}, Lnet/sourceforge/zbar/Symbol;->getLocationX(JI)I

    move-result v8

    if-le v4, v8, :cond_1

    move v4, v8

    :cond_1
    if-ge v6, v8, :cond_2

    move v6, v8

    :cond_2
    iget-wide v8, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v8, v9, v3}, Lnet/sourceforge/zbar/Symbol;->getLocationY(JI)I

    move-result v8

    if-le v5, v8, :cond_3

    move v5, v8

    :cond_3
    if-ge v7, v8, :cond_4

    move v7, v8

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    aput v4, v1, v2

    const/4 v0, 0x1

    aput v5, v1, v0

    const/4 v0, 0x2

    sub-int/2addr v6, v4

    aput v6, v1, v0

    const/4 v0, 0x3

    sub-int/2addr v7, v5

    aput v7, v1, v0

    return-object v1
.end method

.method public getComponents()Lnet/sourceforge/zbar/SymbolSet;
    .locals 3

    new-instance v0, Lnet/sourceforge/zbar/SymbolSet;

    iget-wide v1, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v1, v2}, Lnet/sourceforge/zbar/Symbol;->getComponents(J)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lnet/sourceforge/zbar/SymbolSet;-><init>(J)V

    return-object v0
.end method

.method public native getConfigMask()I
.end method

.method public native getCount()I
.end method

.method public native getData()Ljava/lang/String;
.end method

.method public native getDataBytes()[B
.end method

.method public getLocationPoint(I)[I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-wide v1, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v1, v2, p1}, Lnet/sourceforge/zbar/Symbol;->getLocationX(JI)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget-wide v1, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v1, v2, p1}, Lnet/sourceforge/zbar/Symbol;->getLocationY(JI)I

    move-result p1

    const/4 v1, 0x1

    aput p1, v0, v1

    return-object v0
.end method

.method public native getModifierMask()I
.end method

.method public native getOrientation()I
.end method

.method public native getQuality()I
.end method

.method public getType()I
    .locals 2

    iget v0, p0, Lnet/sourceforge/zbar/Symbol;->type:I

    if-nez v0, :cond_0

    iget-wide v0, p0, Lnet/sourceforge/zbar/Symbol;->peer:J

    invoke-direct {p0, v0, v1}, Lnet/sourceforge/zbar/Symbol;->getType(J)I

    move-result v0

    iput v0, p0, Lnet/sourceforge/zbar/Symbol;->type:I

    :cond_0
    iget v0, p0, Lnet/sourceforge/zbar/Symbol;->type:I

    return v0
.end method

.method native next()J
.end method
