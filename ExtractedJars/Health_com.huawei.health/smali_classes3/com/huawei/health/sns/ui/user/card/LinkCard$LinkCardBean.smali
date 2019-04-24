.class public Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;
.super Lcom/huawei/health/sns/model/user/User;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/card/LinkCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LinkCardBean"
.end annotation


# instance fields
.field private isEnable:Z

.field private isShowBottomLine:Z

.field private messageNum:I

.field private resID:I

.field private subTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 128
    invoke-direct {p0}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isEnable:Z

    .line 159
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isShowBottomLine:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->resID:I

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->messageNum:I

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isEnable:Z

    return v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 229
    invoke-super {p0, p1}, Lcom/huawei/health/sns/model/user/User;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getMessageNum()I
    .locals 1

    .line 196
    iget v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->messageNum:I

    .line 197
    return v0
.end method

.method public getResID()I
    .locals 1

    .line 163
    iget v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->resID:I

    .line 164
    return v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->subTitle:Ljava/lang/String;

    .line 186
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->title:Ljava/lang/String;

    .line 175
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 235
    invoke-super {p0}, Lcom/huawei/health/sns/model/user/User;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEnable()Z
    .locals 1

    .line 207
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isEnable:Z

    .line 208
    return v0
.end method

.method public isShowBottomLine()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isShowBottomLine:Z

    return v0
.end method

.method public setEnable(Z)V
    .locals 0

    .line 213
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isEnable:Z

    .line 214
    return-void
.end method

.method public setMessageNum(I)V
    .locals 0

    .line 202
    iput p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->messageNum:I

    .line 203
    return-void
.end method

.method public setResID(I)V
    .locals 0

    .line 169
    iput p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->resID:I

    .line 170
    return-void
.end method

.method public setShowBottomLine(Z)V
    .locals 0

    .line 223
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isShowBottomLine:Z

    .line 224
    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->subTitle:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->title:Ljava/lang/String;

    .line 181
    return-void
.end method
