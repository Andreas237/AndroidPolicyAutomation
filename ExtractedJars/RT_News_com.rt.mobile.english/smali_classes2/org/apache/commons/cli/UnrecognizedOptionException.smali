.class public Lorg/apache/commons/cli/UnrecognizedOptionException;
.super Lorg/apache/commons/cli/ParseException;
.source "UnrecognizedOptionException.java"


# instance fields
.field private option:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lorg/apache/commons/cli/UnrecognizedOptionException;-><init>(Ljava/lang/String;)V

    .line 54
    iput-object p2, p0, Lorg/apache/commons/cli/UnrecognizedOptionException;->option:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getOption()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lorg/apache/commons/cli/UnrecognizedOptionException;->option:Ljava/lang/String;

    return-object v0
.end method
