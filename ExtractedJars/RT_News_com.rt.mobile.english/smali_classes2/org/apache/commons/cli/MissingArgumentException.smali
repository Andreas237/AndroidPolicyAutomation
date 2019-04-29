.class public Lorg/apache/commons/cli/MissingArgumentException;
.super Lorg/apache/commons/cli/ParseException;
.source "MissingArgumentException.java"


# instance fields
.field private option:Lorg/apache/commons/cli/Option;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/commons/cli/Option;)V
    .locals 2

    .line 52
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Missing argument for option: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/commons/cli/MissingArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    iput-object p1, p0, Lorg/apache/commons/cli/MissingArgumentException;->option:Lorg/apache/commons/cli/Option;

    return-void
.end method


# virtual methods
.method public getOption()Lorg/apache/commons/cli/Option;
    .locals 1

    .line 65
    iget-object v0, p0, Lorg/apache/commons/cli/MissingArgumentException;->option:Lorg/apache/commons/cli/Option;

    return-object v0
.end method
