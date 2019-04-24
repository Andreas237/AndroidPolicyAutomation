.class public Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->b:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->a:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->c:Ljava/lang/String;

    .line 53
    iput-object p4, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->d:Ljava/lang/String;

    .line 54
    iput-object p5, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->e:Ljava/lang/String;

    .line 55
    iput-object p6, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->h:Ljava/lang/String;

    .line 56
    iput p7, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->f:I

    .line 57
    iput p8, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->g:I

    .line 58
    iput-object p9, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->i:Ljava/util/Set;

    .line 59
    iput-object p10, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->j:Ljava/lang/String;

    .line 60
    iput-object p11, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->k:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public static build(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;"
        }
    .end annotation

    .line 44
    new-instance v0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->e:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->c:Ljava/lang/String;

    .line 90
    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->g:I

    .line 130
    return v0
.end method

.method public getGrantedScopes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->i:Ljava/util/Set;

    .line 140
    return-object v0
.end method

.method public getOpenId()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->b:Ljava/lang/String;

    .line 80
    return-object v0
.end method

.method public getPhotoUrl()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->d:Ljava/lang/String;

    .line 100
    return-object v0
.end method

.method public getServerAuthCode()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->j:Ljava/lang/String;

    .line 159
    return-object v0
.end method

.method public getServiceCountryCode()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->h:Ljava/lang/String;

    .line 150
    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 119
    iget v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->f:I

    .line 120
    return v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->a:Ljava/lang/String;

    .line 70
    return-object v0
.end method

.method public getUnionId()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->k:Ljava/lang/String;

    .line 185
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    const-string v0, "{openId: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    const-string v0, "uid: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    const-string v0, "displayName: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    const-string v0, "photoUrl: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    const-string v0, "accessToken: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 174
    const-string v0, "status: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    const-string v0, "gender: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    const-string v0, "serviceCountryCode: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    const-string v0, "unionId: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    const-string v0, "serverAuthCode: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
