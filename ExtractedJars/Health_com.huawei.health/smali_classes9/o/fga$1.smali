.class final Lo/fga$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fga;->a(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/fft;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/fga$1;->b:Ljava/lang/String;

    iput-object p2, p0, Lo/fga$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/fga$1;->d:Lo/fft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 61
    iget-object v0, p0, Lo/fga$1;->b:Ljava/lang/String;

    iget-object v1, p0, Lo/fga$1;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/fga$1;->d:Lo/fft;

    invoke-static {v0, v1, v2}, Lo/fga;->b(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V

    .line 62
    return-void
.end method
