.class public final enum Lcom/ibotta/api/model/common/VerificationType;
.super Ljava/lang/Enum;
.source "VerificationType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/common/VerificationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum APP:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum APP_EVENT:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum BARCODE:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum DIGITAL_DOWNLOAD:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum ONLINE:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum POS:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum POS_RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

.field public static final enum RECEIPT_BARCODE:Lcom/ibotta/api/model/common/VerificationType;


# instance fields
.field private final alwaysNearby:Z

.field private final cameraRequired:Z

.field private final checkPendingReceipt:Z

.field private final loyalty:Z

.field private final online:Z

.field private final physicalReceipt:Z


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 8
    new-instance v9, Lcom/ibotta/api/model/common/VerificationType;

    const-string v1, "RECEIPT"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v9, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    .line 17
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v11, "RECEIPT_BARCODE"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT_BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    .line 26
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v2, "BARCODE"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    .line 35
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v11, "POS"

    const/4 v12, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->POS:Lcom/ibotta/api/model/common/VerificationType;

    .line 44
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v2, "POS_RECEIPT"

    const/4 v3, 0x4

    const/4 v6, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->POS_RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    .line 53
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v11, "APP"

    const/4 v12, 0x5

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    .line 62
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v2, "APP_EVENT"

    const/4 v3, 0x6

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP_EVENT:Lcom/ibotta/api/model/common/VerificationType;

    .line 71
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v11, "DIGITAL_DOWNLOAD"

    const/4 v12, 0x7

    const/4 v13, 0x1

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->DIGITAL_DOWNLOAD:Lcom/ibotta/api/model/common/VerificationType;

    .line 80
    new-instance v0, Lcom/ibotta/api/model/common/VerificationType;

    const-string v2, "ONLINE"

    const/16 v3, 0x8

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/api/model/common/VerificationType;-><init>(Ljava/lang/String;IZZZZZZ)V

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->ONLINE:Lcom/ibotta/api/model/common/VerificationType;

    const/16 v0, 0x9

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/common/VerificationType;

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT_BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->POS:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->POS_RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP_EVENT:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->DIGITAL_DOWNLOAD:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->ONLINE:Lcom/ibotta/api/model/common/VerificationType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/api/model/common/VerificationType;->$VALUES:[Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZZZ)V"
        }
    .end annotation

    .line 102
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 103
    iput-boolean p3, p0, Lcom/ibotta/api/model/common/VerificationType;->online:Z

    .line 104
    iput-boolean p4, p0, Lcom/ibotta/api/model/common/VerificationType;->physicalReceipt:Z

    .line 105
    iput-boolean p5, p0, Lcom/ibotta/api/model/common/VerificationType;->loyalty:Z

    .line 106
    iput-boolean p6, p0, Lcom/ibotta/api/model/common/VerificationType;->cameraRequired:Z

    .line 107
    iput-boolean p7, p0, Lcom/ibotta/api/model/common/VerificationType;->checkPendingReceipt:Z

    .line 108
    iput-boolean p8, p0, Lcom/ibotta/api/model/common/VerificationType;->alwaysNearby:Z

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    if-nez p0, :cond_0

    .line 137
    sget-object p0, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 142
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/common/VerificationType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v0, :cond_1

    .line 148
    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    :cond_1
    return-object v0
.end method

.method public static toApiName(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/common/VerificationType;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/common/VerificationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/common/VerificationType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->$VALUES:[Lcom/ibotta/api/model/common/VerificationType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/common/VerificationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method


# virtual methods
.method public isAlwaysNearby()Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->alwaysNearby:Z

    return v0
.end method

.method public isCameraRequired()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->cameraRequired:Z

    return v0
.end method

.method public isCheckPendingReceipt()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->checkPendingReceipt:Z

    return v0
.end method

.method public isLoyalty()Z
    .locals 1

    .line 120
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->loyalty:Z

    return v0
.end method

.method public isOnline()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->online:Z

    return v0
.end method

.method public isPhysicalReceipt()Z
    .locals 1

    .line 116
    iget-boolean v0, p0, Lcom/ibotta/api/model/common/VerificationType;->physicalReceipt:Z

    return v0
.end method
