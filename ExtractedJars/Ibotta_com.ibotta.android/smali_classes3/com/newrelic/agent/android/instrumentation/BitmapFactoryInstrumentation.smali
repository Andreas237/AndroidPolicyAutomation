.class public Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;
.super Ljava/lang/Object;
.source "BitmapFactoryInstrumentation.java"


# static fields
.field private static final categoryParams:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "category"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "IMAGE"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decodeByteArray([BII)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeByteArray"

    .line 81
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 82
    invoke-static {p0, p1, p2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 83
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeByteArray"

    .line 72
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 73
    invoke-static {p0, p1, p2, p3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 74
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeFile"

    .line 35
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 36
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 37
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeFile"

    .line 26
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 27
    invoke-static {p0, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 28
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeFileDescriptor"

    .line 117
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 118
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 119
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeFileDescriptor"

    .line 108
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 109
    invoke-static {p0, p1, p2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 110
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeResource"

    .line 63
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 64
    invoke-static {p0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 65
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeResource"

    .line 53
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    invoke-static {p0, p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 55
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeResourceStream(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeResourceStream"

    .line 44
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 45
    invoke-static {p0, p1, p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeResourceStream(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 46
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeStream"

    .line 99
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 100
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 101
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = true
        scope = "android.graphics.BitmapFactory"
    .end annotation

    const-string v0, "BitmapFactory#decodeStream"

    .line 90
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 91
    invoke-static {p0, p1, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 92
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method
