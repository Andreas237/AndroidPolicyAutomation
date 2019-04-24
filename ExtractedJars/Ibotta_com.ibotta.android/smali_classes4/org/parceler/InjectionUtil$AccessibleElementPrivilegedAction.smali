.class abstract Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;
.super Ljava/lang/Object;
.source "InjectionUtil.java"

# interfaces
.implements Ljava/security/PrivilegedExceptionAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/InjectionUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "AccessibleElementPrivilegedAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/reflect/AccessibleObject;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedExceptionAction<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final accessible:Ljava/lang/reflect/AccessibleObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/reflect/AccessibleObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput-object p1, p0, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->accessible:Ljava/lang/reflect/AccessibleObject;

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->accessible:Ljava/lang/reflect/AccessibleObject;

    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v0

    .line 223
    iget-object v1, p0, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->accessible:Ljava/lang/reflect/AccessibleObject;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 225
    iget-object v1, p0, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->accessible:Ljava/lang/reflect/AccessibleObject;

    invoke-virtual {p0, v1}, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->run(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;

    move-result-object v1

    .line 227
    iget-object v2, p0, Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;->accessible:Ljava/lang/reflect/AccessibleObject;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object v1
.end method

.method public abstract run(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
