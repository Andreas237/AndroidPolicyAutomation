.class public final Lio/fotoapparat/log/FileLogger;
.super Ljava/lang/Object;
.source "FileLogger.kt"

# interfaces
.implements Lio/fotoapparat/log/Logger;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileLogger.kt\nio/fotoapparat/log/FileLogger\n*L\n1#1,24:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/fotoapparat/log/FileLogger;",
        "Lio/fotoapparat/log/Logger;",
        "file",
        "Ljava/io/File;",
        "(Ljava/io/File;)V",
        "writer",
        "Ljava/io/FileWriter;",
        "getWriter",
        "()Ljava/io/FileWriter;",
        "writer$delegate",
        "Lkotlin/Lazy;",
        "log",
        "",
        "message",
        "",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;


# instance fields
.field private final file:Ljava/io/File;

.field private final writer$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-class v2, Lio/fotoapparat/log/FileLogger;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const-string/jumbo v3, "writer"

    const-string v4, "getWriter()Ljava/io/FileWriter;"

    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lio/fotoapparat/log/FileLogger;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/log/FileLogger;->file:Ljava/io/File;

    .line 12
    new-instance p1, Lio/fotoapparat/log/FileLogger$writer$2;

    invoke-direct {p1, p0}, Lio/fotoapparat/log/FileLogger$writer$2;-><init>(Lio/fotoapparat/log/FileLogger;)V

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/fotoapparat/log/FileLogger;->writer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getFile$p(Lio/fotoapparat/log/FileLogger;)Ljava/io/File;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object p0, p0, Lio/fotoapparat/log/FileLogger;->file:Ljava/io/File;

    return-object p0
.end method

.method private final getWriter()Ljava/io/FileWriter;
    .locals 3

    iget-object v0, p0, Lio/fotoapparat/log/FileLogger;->writer$delegate:Lkotlin/Lazy;

    sget-object v1, Lio/fotoapparat/log/FileLogger;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/FileWriter;

    return-object v0
.end method


# virtual methods
.method public log(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    :try_start_0
    invoke-direct {p0}, Lio/fotoapparat/log/FileLogger;->getWriter()Ljava/io/FileWriter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Lio/fotoapparat/log/FileLogger;->getWriter()Ljava/io/FileWriter;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public recordMethod()V
    .locals 0

    .line 10
    invoke-static {p0}, Lio/fotoapparat/log/Logger$DefaultImpls;->recordMethod(Lio/fotoapparat/log/Logger;)V

    return-void
.end method
