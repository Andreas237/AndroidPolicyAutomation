.class public Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private pictureUrl:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->type:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->subTitle:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->title:Ljava/lang/String;

    .line 19
    iput-object p4, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->pictureUrl:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public getPictureUrl()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->pictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setPictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->pictureUrl:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->subTitle:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->title:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->type:Ljava/lang/String;

    .line 28
    return-void
.end method
