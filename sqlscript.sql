use passport


SET QUOTED_IDENTIFIER ON

GO

DELETE from [passport].[dbo].[users] WHERE email = 'passportuser@interswitchgroup.com'
DELETE from [passport].[dbo].[users] WHERE email = 'admin@sharklasers.com'
