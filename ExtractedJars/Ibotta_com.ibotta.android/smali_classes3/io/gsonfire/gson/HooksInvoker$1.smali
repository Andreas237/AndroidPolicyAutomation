.class Lio/gsonfire/gson/HooksInvoker$1;
.super Lio/gsonfire/util/reflection/AbstractMethodInspector;
.source "HooksInvoker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/HooksInvoker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/gsonfire/util/reflection/AbstractMethodInspector<",
        "Lio/gsonfire/util/reflection/MethodInvoker;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/gsonfire/gson/HooksInvoker;


# direct methods
.method constructor <init>(Lio/gsonfire/gson/HooksInvoker;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lio/gsonfire/gson/HooksInvoker$1;->this$0:Lio/gsonfire/gson/HooksInvoker;

    invoke-direct {p0}, Lio/gsonfire/util/reflection/AbstractMethodInspector;-><init>()V

    return-void
.end method


# virtual methods
.method protected map(Ljava/lang/reflect/Method;)Lio/gsonfire/util/reflection/MethodInvoker;
    .locals 2

    .line 30
    new-instance v0, Lio/gsonfire/util/reflection/MethodInvoker;

    invoke-static {}, Lio/gsonfire/gson/HooksInvoker;->access$000()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lio/gsonfire/util/reflection/MethodInvoker;-><init>(Ljava/lang/reflect/Method;Ljava/util/Set;)V

    return-object v0
.end method

.method protected bridge synthetic map(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p0, p1}, Lio/gsonfire/gson/HooksInvoker$1;->map(Ljava/lang/reflect/Method;)Lio/gsonfire/util/reflection/MethodInvoker;

    move-result-object p1

    return-object p1
.end method
