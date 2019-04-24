.class public Lorg/jivesoftware/smack/parsing/ExceptionThrowingCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleUnparsableStanza(Lorg/jivesoftware/smack/UnparseableStanza;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    invoke-virtual {p1}, Lorg/jivesoftware/smack/UnparseableStanza;->getParsingException()Ljava/lang/Exception;

    move-result-object v0

    throw v0
.end method
