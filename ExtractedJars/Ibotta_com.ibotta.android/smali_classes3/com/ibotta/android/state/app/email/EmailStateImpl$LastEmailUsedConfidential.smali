.class public Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;
.super Ljava/lang/Object;
.source "EmailStateImpl.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/email/EmailStateImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LastEmailUsedConfidential"
.end annotation


# instance fields
.field private email:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;->email:Ljava/lang/String;

    return-object v0
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;->email:Ljava/lang/String;

    return-void
.end method
