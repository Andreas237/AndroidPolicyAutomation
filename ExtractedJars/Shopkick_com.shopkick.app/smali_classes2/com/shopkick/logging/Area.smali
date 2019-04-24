.class public final enum Lcom/shopkick/logging/Area;
.super Ljava/lang/Enum;
.source "Area.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/logging/Area;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/logging/Area;

.field public static final enum ALL:Lcom/shopkick/logging/Area;

.field public static final enum ANALYTIC:Lcom/shopkick/logging/Area;

.field public static final enum APP_LAUNCH:Lcom/shopkick/logging/Area;

.field public static final enum COMM:Lcom/shopkick/logging/Area;

.field public static final enum CRASHLYTICS:Lcom/shopkick/logging/Area;

.field public static final enum KICKS:Lcom/shopkick/logging/Area;

.field public static final enum PRESENCE:Lcom/shopkick/logging/Area;

.field public static final enum REDEEM:Lcom/shopkick/logging/Area;

.field public static final enum SCAN:Lcom/shopkick/logging/Area;

.field public static final enum STORAGE:Lcom/shopkick/logging/Area;

.field public static final enum TEST:Lcom/shopkick/logging/Area;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum UI:Lcom/shopkick/logging/Area;

.field public static final enum USER_ACCOUNT:Lcom/shopkick/logging/Area;

.field public static final enum WALKIN:Lcom/shopkick/logging/Area;


# instance fields
.field private value:J


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 14
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "KICKS"

    const/4 v2, 0x0

    const-wide/16 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->KICKS:Lcom/shopkick/logging/Area;

    .line 16
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "REDEEM"

    const/4 v3, 0x1

    const-wide/16 v4, 0x4

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->REDEEM:Lcom/shopkick/logging/Area;

    .line 18
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "COMM"

    const/4 v4, 0x2

    const-wide/16 v5, 0x8

    invoke-direct {v0, v1, v4, v5, v6}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 20
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "STORAGE"

    const/4 v5, 0x3

    const-wide/16 v6, 0x10

    invoke-direct {v0, v1, v5, v6, v7}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    .line 22
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "UI"

    const/4 v6, 0x4

    const-wide/16 v7, 0x20

    invoke-direct {v0, v1, v6, v7, v8}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    .line 24
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "WALKIN"

    const/4 v7, 0x5

    const-wide/16 v8, 0x40

    invoke-direct {v0, v1, v7, v8, v9}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 26
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "SCAN"

    const/4 v8, 0x6

    const-wide/16 v9, 0x80

    invoke-direct {v0, v1, v8, v9, v10}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    .line 28
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "PRESENCE"

    const/4 v9, 0x7

    const-wide/16 v10, 0x100

    invoke-direct {v0, v1, v9, v10, v11}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 30
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "USER_ACCOUNT"

    const/16 v10, 0x8

    const-wide/16 v11, 0x200

    invoke-direct {v0, v1, v10, v11, v12}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 32
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "APP_LAUNCH"

    const/16 v11, 0x9

    const-wide/16 v12, 0x400

    invoke-direct {v0, v1, v11, v12, v13}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    .line 34
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "CRASHLYTICS"

    const/16 v12, 0xa

    const-wide/16 v13, 0x800

    invoke-direct {v0, v1, v12, v13, v14}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 36
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "ANALYTIC"

    const/16 v13, 0xb

    const-wide/16 v14, 0x1000

    invoke-direct {v0, v1, v13, v14, v15}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->ANALYTIC:Lcom/shopkick/logging/Area;

    .line 39
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "TEST"

    const/16 v14, 0xc

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    invoke-direct {v0, v1, v14, v12, v13}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->TEST:Lcom/shopkick/logging/Area;

    .line 41
    new-instance v0, Lcom/shopkick/logging/Area;

    const-string v1, "ALL"

    const/16 v12, 0xd

    const-wide v14, 0x7fffffffffffffffL

    invoke-direct {v0, v1, v12, v14, v15}, Lcom/shopkick/logging/Area;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    const/16 v0, 0xe

    .line 7
    new-array v0, v0, [Lcom/shopkick/logging/Area;

    sget-object v1, Lcom/shopkick/logging/Area;->KICKS:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/Area;->REDEEM:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/logging/Area;->STORAGE:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v8

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v9

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v10

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v11

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/Area;->ANALYTIC:Lcom/shopkick/logging/Area;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/Area;->TEST:Lcom/shopkick/logging/Area;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    aput-object v1, v0, v12

    sput-object v0, Lcom/shopkick/logging/Area;->$VALUES:[Lcom/shopkick/logging/Area;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/shopkick/logging/Area;->value:J

    return-void
.end method

.method public static areasOverlap(JJ)Z
    .locals 0

    and-long/2addr p0, p2

    const-wide/16 p2, 0x0

    cmp-long p0, p0, p2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static toString(J)Ljava/lang/String;
    .locals 9

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    invoke-static {}, Lcom/shopkick/logging/Area;->values()[Lcom/shopkick/logging/Area;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 62
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    and-long/2addr v5, p0

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_0

    const/16 v5, 0x7c

    .line 64
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    :cond_0
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/logging/Area;
    .locals 1

    .line 7
    const-class v0, Lcom/shopkick/logging/Area;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/logging/Area;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/logging/Area;
    .locals 1

    .line 7
    sget-object v0, Lcom/shopkick/logging/Area;->$VALUES:[Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, [Lcom/shopkick/logging/Area;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/logging/Area;

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/shopkick/logging/Area;->value:J

    return-wide v0
.end method
