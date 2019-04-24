.class public Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ComplainCategory"
.end annotation


# instance fields
.field private name_:Ljava/lang/String;

.field private value_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->name_:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->value_:I

    .line 65
    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->name_:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setValue(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryResponse$ComplainCategory;->value_:I

    .line 71
    return-void
.end method
