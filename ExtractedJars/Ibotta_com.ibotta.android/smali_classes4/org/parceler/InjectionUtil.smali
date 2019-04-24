.class public final Lorg/parceler/InjectionUtil;
.super Ljava/lang/Object;
.source "InjectionUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/InjectionUtil$AccessibleElementPrivilegedAction;,
        Lorg/parceler/InjectionUtil$GetFieldPrivilegedAction;
    }
.end annotation


# direct methods
.method public static getField(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 51
    :try_start_0
    invoke-virtual {p1, p3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    .line 53
    new-instance p1, Lorg/parceler/InjectionUtil$GetFieldPrivilegedAction;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lorg/parceler/InjectionUtil$GetFieldPrivilegedAction;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;Lorg/parceler/InjectionUtil$1;)V

    invoke-static {p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/PrivilegedActionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 62
    new-instance p1, Lorg/parceler/ParcelerRuntimeException;

    const-string p2, "Exception during field injection"

    invoke-direct {p1, p2, p0}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p1

    :catch_1
    move-exception p0

    .line 60
    new-instance p1, Lorg/parceler/ParcelerRuntimeException;

    const-string p2, "PrivilegedActionException Exception during field injection"

    invoke-direct {p1, p2, p0}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p1

    :catch_2
    move-exception p0

    .line 57
    new-instance p1, Lorg/parceler/ParcelerRuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NoSuchFieldException Exception during field injection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " in "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p1
.end method
