.class public Lorg/jivesoftware/smack/parsing/ExceptionLoggingCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;


# static fields
.field private static final TAG:Ljava/lang/String; = "ExceptionLoggingCallback"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleUnparsableStanza(Lorg/jivesoftware/smack/UnparseableStanza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    const-string v0, "ExceptionLoggingCallback"

    const-string v1, "Smack message parsing exception. UnparseableStanza"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    return-void
.end method
