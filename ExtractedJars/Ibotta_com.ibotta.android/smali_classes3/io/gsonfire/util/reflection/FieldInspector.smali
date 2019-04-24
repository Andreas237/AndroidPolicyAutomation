.class public Lio/gsonfire/util/reflection/FieldInspector;
.super Lio/gsonfire/util/reflection/AnnotationInspector;
.source "FieldInspector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/gsonfire/util/reflection/AnnotationInspector<",
        "Ljava/lang/reflect/Field;",
        "Ljava/lang/reflect/Field;",
        ">;"
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
    invoke-virtual {p0, p1}, Lio/gsonfire/util/reflection/FieldInspector;->getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method protected getDeclaredMembers(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic map(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;
    .locals 0

    .line 8
    check-cast p1, Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Lio/gsonfire/util/reflection/FieldInspector;->map(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method protected map(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;
    .locals 0

    return-object p1
.end method
