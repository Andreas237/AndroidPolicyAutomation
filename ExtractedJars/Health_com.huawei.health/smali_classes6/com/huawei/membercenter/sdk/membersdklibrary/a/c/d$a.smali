.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected a(I)V
    .locals 0

    .line 212
    iput p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->a:I

    .line 213
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->b:Ljava/lang/String;

    .line 221
    return-void
.end method
