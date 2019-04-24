.class Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;>;"
    }
.end annotation


# instance fields
.field public b:I

.field public c:Z

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V
    .locals 1

    .line 171
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 166
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->c:Z

    .line 167
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->b:I

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->e:Ljava/lang/ref/WeakReference;

    .line 172
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->e:Ljava/lang/ref/WeakReference;

    .line 173
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 181
    iput p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->b:I

    .line 182
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 5

    .line 187
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->c:Z

    if-nez v0, :cond_0

    .line 188
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyUICallbackOperation() mEnable=false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    .line 192
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 193
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 194
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->b(Z)V

    .line 195
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyUICallbackOperation() saveIsCanLoadMoreAndNotify()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :cond_1
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 177
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->c:Z

    .line 178
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 165
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 203
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->c:Z

    if-nez v0, :cond_0

    .line 204
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackOperation("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") mEnable=false "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    return-void

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    .line 210
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 211
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 212
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyUICallbackOperation("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")-->mNum="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", myself.num="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;->b:I

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 214
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->a(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    .line 215
    invoke-static {v4, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->c(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Ljava/util/List;)V

    .line 216
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    invoke-virtual {v0, p1}, Lo/bur;->c(Ljava/util/List;)V

    .line 217
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyUICallbackOperation()-->notifyClearAndAddALl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :cond_1
    return-void
.end method
