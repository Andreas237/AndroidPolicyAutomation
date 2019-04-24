.class final Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;
.super Lio/gsonfire/util/reflection/AnnotationInspector;
.source "MappedMethodInspector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/gsonfire/util/reflection/AnnotationInspector<",
        "Ljava/lang/reflect/Method;",
        "Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lio/gsonfire/util/reflection/AnnotationInspector;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/AccessibleObject;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;->getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method protected getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    .locals 0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method protected map(Ljava/lang/reflect/Method;)Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;
    .locals 3

    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-gtz v0, :cond_0

    .line 24
    const-class v0, Lio/gsonfire/annotations/ExposeMethodResult;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lio/gsonfire/annotations/ExposeMethodResult;

    .line 26
    new-instance v1, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;

    invoke-interface {v0}, Lio/gsonfire/annotations/ExposeMethodResult;->value()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lio/gsonfire/annotations/ExposeMethodResult;->conflictResolution()Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    move-result-object v0

    invoke-direct {v1, p1, v2, v0}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;-><init>(Ljava/lang/reflect/Method;Ljava/lang/String;Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;)V

    return-object v1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The methods annotated with ExposeMethodResult should have no arguments"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected bridge synthetic map(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p0, p1}, Lio/gsonfire/postprocessors/methodinvoker/MappedMethodInspector;->map(Ljava/lang/reflect/Method;)Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;

    move-result-object p1

    return-object p1
.end method
