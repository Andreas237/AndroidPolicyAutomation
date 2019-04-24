.class public Lcom/huawei/openalliance/ad/db/bean/SloganRecord;
.super Lcom/huawei/openalliance/ad/db/bean/RecordBean;


# static fields
.field public static final CONTENT_ID:Ljava/lang/String; = "contentId"

.field public static final END_TIME:Ljava/lang/String; = "endTime"

.field public static final HEIGHT:Ljava/lang/String; = "height"

.field public static final SHA256:Ljava/lang/String; = "sha256"

.field public static final START_TIME:Ljava/lang/String; = "startTime"

.field private static final TAG:Ljava/lang/String; = "SloganRecord"

.field public static final URL:Ljava/lang/String; = "url"

.field public static final WIDTH:Ljava/lang/String; = "width"


# instance fields
.field private contentId_:Ljava/lang/String;

.field private creativeType_:I

.field private endTime_:J

.field private height_:I

.field private paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private sha256_:Ljava/lang/String;

.field private startTime_:J

.field private url_:Ljava/lang/String;

.field private width_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getContentId_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->contentId_:Ljava/lang/String;

    return-object v0
.end method

.method public getCreativeType_()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->creativeType_:I

    return v0
.end method

.method public getEndTime_()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->endTime_:J

    return-wide v0
.end method

.method public getHeight_()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->height_:I

    return v0
.end method

.method public getParamFromServer_()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-object v0
.end method

.method public getSha256_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->sha256_:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime_()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->startTime_:J

    return-wide v0
.end method

.method public getUrl_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->url_:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth_()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->width_:I

    return v0
.end method

.method public setContentId_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->contentId_:Ljava/lang/String;

    return-void
.end method

.method public setCreativeType_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->creativeType_:I

    return-void
.end method

.method public setEndTime_(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->endTime_:J

    return-void
.end method

.method public setHeight_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->height_:I

    return-void
.end method

.method public setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-void
.end method

.method public setParamFromServer_(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    const-class v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->paramFromServer_:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setOriginalField(Ljava/lang/Object;)V

    return-void
.end method

.method public setSha256_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->sha256_:Ljava/lang/String;

    return-void
.end method

.method public setStartTime_(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->startTime_:J

    return-void
.end method

.method public setUrl_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->url_:Ljava/lang/String;

    return-void
.end method

.method public setWidth_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->width_:I

    return-void
.end method
