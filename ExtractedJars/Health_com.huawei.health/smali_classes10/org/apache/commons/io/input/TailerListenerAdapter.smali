.class public Lorg/apache/commons/io/input/TailerListenerAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/commons/io/input/TailerListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public endOfFileReached()V
    .locals 0

    .line 79
    return-void
.end method

.method public fileNotFound()V
    .locals 0

    .line 40
    return-void
.end method

.method public fileRotated()V
    .locals 0

    .line 50
    return-void
.end method

.method public handle(Ljava/lang/Exception;)V
    .locals 0

    .line 66
    return-void
.end method

.method public handle(Ljava/lang/String;)V
    .locals 0

    .line 58
    return-void
.end method

.method public init(Lorg/apache/commons/io/input/Tailer;)V
    .locals 0

    .line 33
    return-void
.end method
