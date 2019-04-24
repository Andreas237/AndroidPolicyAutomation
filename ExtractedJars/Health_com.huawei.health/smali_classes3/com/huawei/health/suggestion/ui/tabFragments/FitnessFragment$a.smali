.class Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;>;"
        }
    .end annotation
.end field

.field public b:I

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->e:Z

    .line 97
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b:I

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a:Ljava/lang/ref/WeakReference;

    .line 102
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a:Ljava/lang/ref/WeakReference;

    .line 103
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b:I

    .line 112
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 5

    .line 120
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList() onfalure errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorinfo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->e:Z

    if-nez v0, :cond_0

    .line 122
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyUICallbackTopicList() mEnable=false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    .line 126
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 127
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 128
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->b(Z)V

    .line 129
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyUICallbackTopicList() saveIsCanLoadMoreAndNotify()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 106
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") setEnable()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->e:Z

    .line 108
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 95
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->e(Ljava/util/List;)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 136
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") onSuccess()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->e:Z

    if-nez v0, :cond_0

    .line 138
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") mEnable = false "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    .line 143
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 144
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 145
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")-->mPage="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", myself.pager="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->b:I

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 147
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    .line 148
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    invoke-virtual {v0, p1}, Lo/bur;->a(Ljava/util/List;)V

    .line 149
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackTopicList("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")-->notifyAddAll()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :cond_1
    return-void
.end method
