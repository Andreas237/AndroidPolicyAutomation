.class public Lnet/hockeyapp/android/objects/ErrorObject;
.super Ljava/lang/Object;
.source "ErrorObject.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x14ede2a74a40f08cL


# instance fields
.field private mCode:I

.field private mMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lnet/hockeyapp/android/objects/ErrorObject;->mMessage:Ljava/lang/String;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lnet/hockeyapp/android/objects/ErrorObject;->mMessage:Ljava/lang/String;

    return-void
.end method
