.class Ldagger/internal/Linker$SingletonBinding;
.super Ldagger/internal/Binding;
.source "Linker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldagger/internal/Linker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SingletonBinding"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldagger/internal/Binding<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final binding:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile onlyInstance:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ldagger/internal/Binding;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Binding<",
            "TT;>;)V"
        }
    .end annotation

    .line 347
    iget-object v0, p1, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    iget-object v1, p1, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    iget-object v2, p1, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v3, v2}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    .line 344
    invoke-static {}, Ldagger/internal/Linker;->access$200()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->onlyInstance:Ljava/lang/Object;

    .line 348
    iput-object p1, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    return-void
.end method

.method synthetic constructor <init>(Ldagger/internal/Binding;Ldagger/internal/Linker$1;)V
    .locals 0

    .line 342
    invoke-direct {p0, p1}, Ldagger/internal/Linker$SingletonBinding;-><init>(Ldagger/internal/Binding;)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 1

    .line 352
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->attach(Ldagger/internal/Linker;)V

    return-void
.end method

.method public dependedOn()Z
    .locals 1

    .line 392
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->dependedOn()Z

    move-result v0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 361
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->onlyInstance:Ljava/lang/Object;

    invoke-static {}, Ldagger/internal/Linker;->access$200()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 362
    monitor-enter p0

    .line 363
    :try_start_0
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->onlyInstance:Ljava/lang/Object;

    invoke-static {}, Ldagger/internal/Linker;->access$200()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 364
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->onlyInstance:Ljava/lang/Object;

    .line 366
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 368
    :cond_1
    :goto_0
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->onlyInstance:Ljava/lang/Object;

    return-object v0
.end method

.method public getDependencies(Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;)V"
        }
    .end annotation

    .line 372
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1, p2}, Ldagger/internal/Binding;->getDependencies(Ljava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 356
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->injectMembers(Ljava/lang/Object;)V

    return-void
.end method

.method public isCycleFree()Z
    .locals 1

    .line 376
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->isCycleFree()Z

    move-result v0

    return v0
.end method

.method public isLinked()Z
    .locals 1

    .line 380
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->isLinked()Z

    move-result v0

    return v0
.end method

.method protected isSingleton()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isVisiting()Z
    .locals 1

    .line 384
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->isVisiting()Z

    move-result v0

    return v0
.end method

.method public library()Z
    .locals 1

    .line 388
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->library()Z

    move-result v0

    return v0
.end method

.method public setCycleFree(Z)V
    .locals 1

    .line 396
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->setCycleFree(Z)V

    return-void
.end method

.method public setDependedOn(Z)V
    .locals 1

    .line 408
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->setDependedOn(Z)V

    return-void
.end method

.method public setLibrary(Z)V
    .locals 1

    .line 404
    iget-object p1, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ldagger/internal/Binding;->setLibrary(Z)V

    return-void
.end method

.method protected setLinked()V
    .locals 1

    .line 416
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->setLinked()V

    return-void
.end method

.method public setVisiting(Z)V
    .locals 1

    .line 400
    iget-object v0, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->setVisiting(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@Singleton/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldagger/internal/Linker$SingletonBinding;->binding:Ldagger/internal/Binding;

    invoke-virtual {v1}, Ldagger/internal/Binding;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
