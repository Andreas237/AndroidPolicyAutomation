.class public Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static mInstance:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;


# instance fields
.field private mMessage:Ljava/lang/String;

.field private mNegativeListener:Landroid/view/View$OnClickListener;

.field private mNegativeText:Ljava/lang/String;

.field private mPositionListener:Landroid/view/View$OnClickListener;

.field private mPositionText:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const-class v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;
    .locals 2

    .line 29
    sget-object v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mInstance:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mInstance:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    .line 33
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mInstance:Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    return-object v0
.end method


# virtual methods
.method public DiaData1()V
    .locals 0

    .line 96
    return-void
.end method

.method public DiaData2()V
    .locals 0

    .line 97
    return-void
.end method

.method public DiaData3()V
    .locals 0

    .line 98
    return-void
.end method

.method public DiaData4()V
    .locals 0

    .line 99
    return-void
.end method

.method public DiaData5()V
    .locals 0

    .line 100
    return-void
.end method

.method public DiaData6()V
    .locals 0

    .line 101
    return-void
.end method

.method public DiaData7()V
    .locals 0

    .line 102
    return-void
.end method

.method public DiaData8()V
    .locals 0

    .line 103
    return-void
.end method

.method public DiaData9()V
    .locals 0

    .line 104
    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getNegativeListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mNegativeListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getNegativeText()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mNegativeText:Ljava/lang/String;

    return-object v0
.end method

.method public getPositionListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mPositionListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getPositionText()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mPositionText:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mMessage:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mNegativeText:Ljava/lang/String;

    .line 85
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mNegativeListener:Landroid/view/View$OnClickListener;

    .line 86
    return-void
.end method

.method public setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mPositionText:Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mPositionListener:Landroid/view/View$OnClickListener;

    .line 68
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->mTitle:Ljava/lang/String;

    .line 42
    return-void
.end method
