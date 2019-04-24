.class public abstract Lio/gsonfire/util/reflection/AbstractMethodInspector;
.super Lio/gsonfire/util/reflection/AnnotationInspector;
.source "AbstractMethodInspector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Ljava/lang/Object;",
        ">",
        "Lio/gsonfire/util/reflection/AnnotationInspector<",
        "Ljava/lang/reflect/Method;",
        "TM;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lio/gsonfire/util/reflection/AnnotationInspector;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/AccessibleObject;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lio/gsonfire/util/reflection/AbstractMethodInspector;->getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method protected getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    .locals 0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method
