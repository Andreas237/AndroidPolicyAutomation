.class public Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->questions:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;>;"
        }
    .end annotation

    .line 15
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->questions:Ljava/util/List;

    return-object v0
.end method

.method public static setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;>;)V"
        }
    .end annotation

    .line 19
    sput-object p0, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->questions:Ljava/util/List;

    .line 20
    return-void
.end method
