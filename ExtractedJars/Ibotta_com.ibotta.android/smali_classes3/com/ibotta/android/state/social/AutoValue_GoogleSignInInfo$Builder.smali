.class final Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;
.super Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.source "AutoValue_GoogleSignInInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private authCode:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private expiration:Ljava/lang/Long;

.field private firstName:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private profilePicUrl:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public authCode(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 142
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->authCode:Ljava/lang/String;

    return-object p0

    .line 140
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/android/state/social/GoogleSignInInfo;
    .locals 12

    const-string v0, ""

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->id:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 188
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->authCode:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authCode"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 191
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->expiration:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expiration"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 194
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->firstName:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " firstName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 197
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->lastName:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 198
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " lastName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 200
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->email:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " email"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 203
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->profilePicUrl:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " profilePicUrl"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 206
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 209
    new-instance v0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;

    iget-object v3, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->authCode:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->expiration:Ljava/lang/Long;

    .line 212
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->firstName:Ljava/lang/String;

    iget-object v8, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->lastName:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->email:Ljava/lang/String;

    iget-object v10, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->profilePicUrl:Ljava/lang/String;

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$1;)V

    return-object v0

    .line 207
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public email(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->email:Ljava/lang/String;

    return-object p0

    .line 169
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null email"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public expiration(J)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 0

    .line 147
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->expiration:Ljava/lang/Long;

    return-object p0
.end method

.method public firstName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 155
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->firstName:Ljava/lang/String;

    return-object p0

    .line 153
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null firstName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public id(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 134
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->id:Ljava/lang/String;

    return-object p0

    .line 132
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null id"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public lastName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 163
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->lastName:Ljava/lang/String;

    return-object p0

    .line 161
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null lastName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public profilePicUrl(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 179
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;->profilePicUrl:Ljava/lang/String;

    return-object p0

    .line 177
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null profilePicUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
