.class public final Ldagger/internal/SetBinding;
.super Ldagger/internal/Binding;
.source "SetBinding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldagger/internal/Binding<",
        "Ljava/util/Set<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field private final contributors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final parent:Ldagger/internal/SetBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/SetBinding<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/SetBinding;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/SetBinding<",
            "TT;>;)V"
        }
    .end annotation

    .line 81
    iget-object v0, p1, Ldagger/internal/SetBinding;->provideKey:Ljava/lang/String;

    iget-object v1, p1, Ldagger/internal/SetBinding;->requiredBy:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3, v1}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    .line 82
    iput-object p1, p0, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    .line 83
    invoke-virtual {p1}, Ldagger/internal/SetBinding;->library()Z

    move-result v0

    invoke-virtual {p0, v0}, Ldagger/internal/SetBinding;->setLibrary(Z)V

    .line 84
    invoke-virtual {p1}, Ldagger/internal/SetBinding;->dependedOn()Z

    move-result p1

    invoke-virtual {p0, p1}, Ldagger/internal/SetBinding;->setDependedOn(Z)V

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 71
    invoke-direct {p0, p1, v0, v1, p2}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    .line 72
    iput-object v0, p0, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    .line 73
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    return-void
.end method

.method public static add(Ldagger/internal/BindingsGroup;Ljava/lang/String;Ldagger/internal/Binding;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldagger/internal/BindingsGroup;",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;)V"
        }
    .end annotation

    .line 33
    invoke-static {p0, p1, p2}, Ldagger/internal/SetBinding;->prepareSetBinding(Ldagger/internal/BindingsGroup;Ljava/lang/String;Ldagger/internal/Binding;)Ldagger/internal/SetBinding;

    move-result-object p0

    iget-object p0, p0, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-static {p2}, Ldagger/internal/Linker;->scope(Ldagger/internal/Binding;)Ldagger/internal/Binding;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static prepareSetBinding(Ldagger/internal/BindingsGroup;Ljava/lang/String;Ldagger/internal/Binding;)Ldagger/internal/SetBinding;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldagger/internal/BindingsGroup;",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;)",
            "Ldagger/internal/SetBinding<",
            "TT;>;"
        }
    .end annotation

    .line 39
    invoke-virtual {p0, p1}, Ldagger/internal/BindingsGroup;->get(Ljava/lang/String;)Ldagger/internal/Binding;

    move-result-object v0

    .line 41
    instance-of v1, v0, Ldagger/internal/SetBinding;

    if-eqz v1, :cond_1

    .line 42
    check-cast v0, Ldagger/internal/SetBinding;

    .line 43
    invoke-virtual {v0}, Ldagger/internal/SetBinding;->library()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Ldagger/internal/Binding;->library()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Ldagger/internal/SetBinding;->setLibrary(Z)V

    return-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 46
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Duplicate:\n    "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n    "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 48
    :cond_2
    new-instance v0, Ldagger/internal/SetBinding;

    iget-object v1, p2, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Ldagger/internal/SetBinding;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p2}, Ldagger/internal/Binding;->library()Z

    move-result p2

    invoke-virtual {v0, p2}, Ldagger/internal/SetBinding;->setLibrary(Z)V

    .line 50
    invoke-virtual {p0, p1, v0}, Ldagger/internal/BindingsGroup;->contributeSetBinding(Ljava/lang/String;Ldagger/internal/SetBinding;)Ldagger/internal/Binding;

    .line 51
    invoke-virtual {p0, p1}, Ldagger/internal/BindingsGroup;->get(Ljava/lang/String;)Ldagger/internal/Binding;

    move-result-object p0

    check-cast p0, Ldagger/internal/SetBinding;

    return-object p0
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 2

    .line 89
    iget-object v0, p0, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldagger/internal/Binding;

    .line 90
    invoke-virtual {v1, p1}, Ldagger/internal/Binding;->attach(Ldagger/internal/Linker;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 30
    invoke-virtual {p0}, Ldagger/internal/SetBinding;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 106
    iget-object v3, v1, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    :goto_1
    if-ge v2, v3, :cond_1

    .line 107
    iget-object v4, v1, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldagger/internal/Binding;

    .line 108
    invoke-virtual {v4}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v5

    .line 109
    iget-object v4, v4, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    iget-object v6, p0, Ldagger/internal/SetBinding;->provideKey:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 110
    check-cast v5, Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 112
    :cond_0
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 105
    :cond_1
    iget-object v1, v1, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    goto :goto_0

    .line 116
    :cond_2
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

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

    move-object p2, p0

    :goto_0
    if-eqz p2, :cond_0

    .line 122
    iget-object v0, p2, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 121
    iget-object p2, p2, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 30
    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Ldagger/internal/SetBinding;->injectMembers(Ljava/util/Set;)V

    return-void
.end method

.method public injectMembers(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "TT;>;)V"
        }
    .end annotation

    .line 127
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Cannot inject members on a contributed Set<T>."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public size()I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    .line 97
    iget-object v2, v0, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    .line 96
    iget-object v0, v0, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    goto :goto_0

    :cond_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SetBinding["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    move v2, v1

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_2

    .line 134
    iget-object v3, v1, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v2

    move v2, v4

    :goto_1
    if-ge v2, v3, :cond_1

    if-nez v5, :cond_0

    const-string v5, ","

    .line 136
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :cond_0
    iget-object v5, v1, Ldagger/internal/SetBinding;->contributors:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    move v5, v4

    goto :goto_1

    .line 133
    :cond_1
    iget-object v1, v1, Ldagger/internal/SetBinding;->parent:Ldagger/internal/SetBinding;

    move v2, v5

    goto :goto_0

    :cond_2
    const-string v1, "]"

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
