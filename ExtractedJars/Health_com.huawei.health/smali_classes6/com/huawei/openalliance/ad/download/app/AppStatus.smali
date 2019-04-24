.class public final enum Lcom/huawei/openalliance/ad/download/app/AppStatus;
.super Ljava/lang/Enum;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/download/app/AppStatus;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum INSTALL:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum INSTALLING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

.field public static final enum UNKNOWN:Lcom/huawei/openalliance/ad/download/app/AppStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->UNKNOWN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "OPEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "DOWNLOADING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "PAUSE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "INSTALLING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALLING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const-string v1, "INSTALL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALL:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/huawei/openalliance/ad/download/app/AppStatus;

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->UNKNOWN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->OPEN:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALLING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/AppStatus;->INSTALL:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->$VALUES:[Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/download/app/AppStatus;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->$VALUES:[Lcom/huawei/openalliance/ad/download/app/AppStatus;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/download/app/AppStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-object v0
.end method
