.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final dataCenter:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field

.field private static final optionResult:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final stringDataCenter:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->dataCenter:Ljava/util/HashMap;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->optionResult:Ljava/util/HashMap;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->stringDataCenter:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addInt(Ljava/util/List;Ljava/lang/Integer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/Integer;)Z"
        }
    .end annotation

    .line 37
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static clearAllResult()V
    .locals 2

    .line 42
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->dataCenter:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 43
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->dataCenter:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 45
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->optionResult:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 46
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->optionResult:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 48
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->stringDataCenter:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 49
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->stringDataCenter:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 52
    :cond_2
    return-void
.end method

.method public static deleteInt(Ljava/util/List;Ljava/lang/Integer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/Integer;)Z"
        }
    .end annotation

    .line 33
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static getDataCenter()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->dataCenter:Ljava/util/HashMap;

    return-object v0
.end method

.method public static getOptionResult()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->optionResult:Ljava/util/HashMap;

    return-object v0
.end method

.method public static getStringDataCenter()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation

    .line 21
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->stringDataCenter:Ljava/util/HashMap;

    return-object v0
.end method

.method public static queryInt(Ljava/lang/Integer;)Z
    .locals 1

    .line 25
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static queryInt(Ljava/util/List;Ljava/lang/Integer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/Integer;)Z"
        }
    .end annotation

    .line 29
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
