.class public Lo/exd$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/exd$b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/exd$b;->b:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lo/exd$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/exd$b;->d:Ljava/lang/String;

    .line 90
    return-void
.end method
