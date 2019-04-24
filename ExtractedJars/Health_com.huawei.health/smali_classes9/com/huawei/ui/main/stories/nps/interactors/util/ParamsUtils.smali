.class public Lcom/huawei/ui/main/stories/nps/interactors/util/ParamsUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final K_CLOUD_FRAGEMENT_START:Ljava/lang/String; = "09F98935DF23B3E011F5638614670662"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getQuestionTypeParams(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 10
    const-string v0, "option"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    const-string v0, ""

    return-object v0

    .line 12
    :cond_0
    const-string v0, "M"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    const-string v0, ""

    return-object v0

    .line 15
    :cond_1
    const-string v0, ""

    return-object v0
.end method
