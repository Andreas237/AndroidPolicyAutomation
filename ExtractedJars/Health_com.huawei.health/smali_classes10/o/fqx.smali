.class public Lo/fqx;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final b:Lo/fqb;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo/fqb;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 30
    iput-object p2, p0, Lo/fqx;->b:Lo/fqb;

    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo/fqb;Ljava/lang/Throwable;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    iput-object p2, p0, Lo/fqx;->b:Lo/fqb;

    .line 36
    return-void
.end method


# virtual methods
.method public d()Lo/fqb;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/fqx;->b:Lo/fqb;

    return-object v0
.end method
