.class public final enum Lcom/huawei/openalliance/ad/media/MediaState$State;
.super Ljava/lang/Enum;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/MediaState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/media/MediaState$State;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum END:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field public static final enum PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;


# instance fields
.field code:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "END"

    const/4 v2, 0x0

    const/4 v3, -0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "IDLE"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x3

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "PREPARING"

    const/4 v2, 0x4

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "PREPARED"

    const/4 v2, 0x5

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "PLAYING"

    const/4 v2, 0x6

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "PAUSED"

    const/4 v2, 0x7

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    const-string v1, "PLAYBACK_COMPLETED"

    const/16 v2, 0x8

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/MediaState$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/16 v0, 0x9

    new-array v0, v0, [Lcom/huawei/openalliance/ad/media/MediaState$State;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->$VALUES:[Lcom/huawei/openalliance/ad/media/MediaState$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/huawei/openalliance/ad/media/MediaState$State;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/media/MediaState$State;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/media/MediaState$State;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/media/MediaState$State;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->$VALUES:[Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/media/MediaState$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/media/MediaState$State;

    return-object v0
.end method


# virtual methods
.method public getCode()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaState$State;->code:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/media/MediaState$State;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/media/MediaState$State;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
