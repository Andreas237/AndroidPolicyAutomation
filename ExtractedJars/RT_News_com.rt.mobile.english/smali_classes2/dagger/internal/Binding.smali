.class public abstract Ldagger/internal/Binding;
.super Ljava/lang/Object;
.source "Binding.java"

# interfaces
.implements Ljavax/inject/Provider;
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldagger/internal/Binding$InvalidBindingException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "TT;>;",
        "Ldagger/MembersInjector<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final CYCLE_FREE:I = 0x8

.field private static final DEPENDED_ON:I = 0x10

.field protected static final IS_SINGLETON:Z = true

.field private static final LIBRARY:I = 0x20

.field private static final LINKED:I = 0x2

.field protected static final NOT_SINGLETON:Z = false

.field private static final SINGLETON:I = 0x1

.field public static final UNRESOLVED:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final VISITING:I = 0x4


# instance fields
.field private bits:I

.field public final membersKey:Ljava/lang/String;

.field public final provideKey:Ljava/lang/String;

.field public final requiredBy:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 26
    new-instance v0, Ldagger/internal/Binding$1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2, v1}, Ldagger/internal/Binding$1;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    sput-object v0, Ldagger/internal/Binding;->UNRESOLVED:Ldagger/internal/Binding;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    if-nez p1, :cond_0

    .line 66
    new-instance p1, Ldagger/internal/Binding$InvalidBindingException;

    invoke-static {p2}, Ldagger/internal/Keys;->getClassName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "is exclusively members injected and therefore cannot be scoped"

    invoke-direct {p1, p2, p3}, Ldagger/internal/Binding$InvalidBindingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_0
    iput-object p1, p0, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    .line 70
    iput-object p2, p0, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    .line 71
    iput-object p4, p0, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    .line 72
    iput p3, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 0

    return-void
.end method

.method public dependedOn()Z
    .locals 1

    .line 146
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 87
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No injectable constructor on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getDependencies(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
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

    return-void
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public isCycleFree()Z
    .locals 1

    .line 126
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isLinked()Z
    .locals 1

    .line 110
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isSingleton()Z
    .locals 2

    .line 114
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isVisiting()Z
    .locals 1

    .line 118
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public library()Z
    .locals 1

    .line 138
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setCycleFree(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 130
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    or-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 p1, p1, -0x9

    :goto_0
    iput p1, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method

.method public setDependedOn(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 142
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    or-int/lit8 p1, p1, 0x10

    goto :goto_0

    :cond_0
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 p1, p1, -0x11

    :goto_0
    iput p1, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method

.method public setLibrary(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 134
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    or-int/lit8 p1, p1, 0x20

    goto :goto_0

    :cond_0
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 p1, p1, -0x21

    :goto_0
    iput p1, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method

.method setLinked()V
    .locals 1

    .line 106
    iget v0, p0, Ldagger/internal/Binding;->bits:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method

.method public setVisiting(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 122
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    or-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    iget p1, p0, Ldagger/internal/Binding;->bits:I

    and-int/lit8 p1, p1, -0x5

    :goto_0
    iput p1, p0, Ldagger/internal/Binding;->bits:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[provideKey=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", memberskey=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
