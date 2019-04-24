.class public Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/circle/GetCircleResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CircleContent"
.end annotation


# instance fields
.field private circle_type_:I

.field private html_content_:Ljava/lang/String;

.field private image_url_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 202
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCircle_type_()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->circle_type_:I

    .line 236
    return v0
.end method

.method public getHtml_content_()Ljava/lang/String;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->html_content_:Ljava/lang/String;

    .line 248
    return-object v0
.end method

.method public getImage_url_()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->image_url_:Ljava/lang/String;

    .line 242
    return-object v0
.end method

.method public setCircle_type_(I)V
    .locals 0

    .line 222
    iput p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->circle_type_:I

    .line 223
    return-void
.end method

.method public setHtml_content_(Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->html_content_:Ljava/lang/String;

    .line 231
    return-void
.end method

.method public setImage_url_(Ljava/lang/String;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->image_url_:Ljava/lang/String;

    .line 227
    return-void
.end method
